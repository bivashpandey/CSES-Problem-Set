'''
Problem: https://cses.fi/problemset/task/1068
Author: Bivash Pandey
'''

n = int(input())
while n!=1:
    print(f"{n} ", end = " ")
    n = n//2 if (n%2==0) else 3*n+1
print(1)
