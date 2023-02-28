import numpy as np
import math
import pickle
import matplotlib.pyplot as plt

def my_split(s):
    block_start = False
    start_index = 0
    ret_list=[]
    for i, c in enumerate(s):
        if block_start==False:
            if c==',':
                ret_list.append(s[start_index:i])
                start_index=i+1
            elif c=='"':
                block_start=True
                start_index = i
        else:
            if c=='"':
                block_start=False
    if s[-1]!=',':
        ret_list.append(s[start_index:])
    return ret_list

def split_len(data_list):
    len_list=[]
    for e in data_list:
        len_list.append(len(e))
    print(set(len_list))
    if len(set(len_list))>1:
        for i in set(len_list):
            print(i, len_list.count(i))

def dist_np(p1, p2): #  [3,10]  [5,25]
    return math.sqrt(sum((p2-p1)**2))

def process_product_names(s):
    r = []
    remove_after = ['(', ' 외', ' 외']
    split_at = ['+', ',']
    for c in remove_after:
        if c in s:
            s = s[:s.index(c)]
        
    for c in split_at:
        if c in s:
            r = r + s.split(c)
            
    if len(r) == 0:
        r.append(s)
    
    return r

# sample1 = 'productA+productB'
# sample2 = 'productA,productB'
# sample3 = 'product(A+B)'
# sample4 = 'product 외 abc'
# sample5 = 'product'

# print(process_product_names(sample1)) #['productA', 'productB']
# print(process_product_names(sample2))
# print(process_product_names(sample3))
# print(process_product_names(sample4))
# print(process_product_names(sample5))

def fact(n):
    ret = 1
    while n>1:
        ret *= n
        n -= 1
    return ret

def fact_r(n):
    if n==2:
        return n
    return fact_r(n-1)*n

def perm_f(n, r):
    return fact(n)/fact(n-r)

def combi_f(n, r):
    return fact(n)/(fact(n-r)*fact(r))

def count_with_replacement_order(pool, sel_count):  # all
    if sel_count == 1:
        return len(pool), [[x] for x in pool]
    a, b = count_with_replacement_order(pool, sel_count-1)
    r = []
    for x in pool:
        for b_i in b:
            r.append(b_i+[x])
    return len(r), r    

def perm_pool(pool, r):
    if r == 1:
        return len(pool), [[x] for x in pool]
    ret = []
    for x in pool:
        pool_copy = [y for y in pool]
        pool_copy.remove(x)
        a, b = perm_pool(pool_copy, r-1)
        for b_i in b:
            ret.append(b_i+[x])
    return len(ret), ret

def combi_pool(pool, r):
    a , b = perm_pool(pool, r)
    r = []
    for b_i in b:
        r.append(set(b_i))
    f = []
    for r_i in r:
        if r_i not in f:
            f.append(r_i)
    return len(f), f

def normal(x, mu=0, sigma=1):
    return (1/np.sqrt(2*np.pi)*sigma) * np.exp(-0.5*(((x-mu)/sigma)**2))

def read_data():
    raw_data=[]
    with open ('가스공급량_20230217170926.csv') as f:
        for line in f:
            raw_data.append(line[:-1].split(','))
        np_data = np.array(raw_data[2:])
        np_data = np_data[:, 2:].astype(np.int64)
        return np_data

def get_corr(np_data):
    by_year = np.add.reduceat(np_data, np.arange(10, 130, 12))
    return np.corrcoef(by_year[:, 1], by_year[:, 5])



def fetch_uci_data(url):
    d = requests.get(url)
    t = []
    for line in d.text.split('\n'):
        if len(line) !=0:
            t.append(line.split(','))
    return np.array(t)
    
def get_corr(d):
    male_filter = (d[:, 0]=='M')
    male_samples = d[male_filter]
    male_length = male_samples[:, 1].astype(np.float64)
    male_diameter = male_samples[:, 2].astype(np.float64)
    return np.corrcoef(male_length, male_diameter)

def check_split(list_data):
    t = set()
    for e in list_data:
        t.add(len(e))
    return len(t)