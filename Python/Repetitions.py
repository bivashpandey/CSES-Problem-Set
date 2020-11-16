'''
Problem: https://cses.fi/problemset/task/1069
Author: Bivash Pandey
'''

dna = input()
max_length = 1
count = 1
for i in range(len(dna)-1):
    if dna[i+1] == dna[i]: count += 1
    else: count = 1
    if count > max_length: max_length = count
print(max_length)