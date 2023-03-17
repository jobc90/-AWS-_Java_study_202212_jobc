#!/usr/bin/env python
# coding: utf-8

# In[17]:


def my_sq_prod(number_list):

   return_value = 1

   for number in number_list:

        return_value = return_value * number**2

   return return_value



assert my_sq_prod([1,2,3]) == 36


# In[15]:


import math
import numpy as np

def my_sq_prod2(np.array):
    
    for i in np.array:

        return_list.append(i**2)

    print("return_list =", return_list)

    print(" 제곱한 값의 곱 =", math.prod(return_list))

my_sq_prod2([1,2,3])


# In[19]:


import numpy as np

def my_sq_prod3(ndarray):
    return np.prod(ndarray ** 2)

assert my_sq_prod3(np.array([4,5,6])) == 14400


# In[23]:


def my_sq_prod(number_list):

   return_value = 1

   for number in number_list:

        return_value = return_value * number**2

   return return_value


def score_check():

   score = 0

   if my_sq_prod([1,2,3])==36:

       score += 30

   print(score)

if __name__ == "__main__":
    score_check()

