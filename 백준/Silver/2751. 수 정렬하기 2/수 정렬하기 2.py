import sys

n = int(input())
list = []

while n > 0:
    list.append(int(sys.stdin.readline().strip()))
    n -= 1

list.sort()

for i in list:
    print(i)