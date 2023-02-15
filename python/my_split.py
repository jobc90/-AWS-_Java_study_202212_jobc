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