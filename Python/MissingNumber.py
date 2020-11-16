'''
Problem: https://cses.fi/problemset/task/1083
Author: Bivash Pandey
'''

n = int(input())
nums = input()
lst = [int(x) for x in nums.split(" ")]
lst.sort()

if lst[0] != 1: print(1)
elif lst[n-2] != n: print(n)
else:
    for i in range(0, len(lst)):
        if i+1 != lst[i]:
            print(i+1)
            break