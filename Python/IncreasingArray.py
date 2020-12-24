'''
Problem: https://cses.fi/problemset/task/1094
Author: Bivash Pandey
'''
n = int(input())
arr = list(map(int, input().split()))
tempArr, turns, prev = [], 0, 0
for element in arr:
    if element > prev:
        prev = element
    tempArr.append(prev)

for i in range(n):
    turns += tempArr[i] - arr[i]

print(turns)
