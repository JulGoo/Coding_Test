n = int(input())
a = 0
b = 0
count = 0

if (n < 10):
    a = 0
    b = n
else:
    a = int(n / 10)
    b = int(n % 10)

while (True):
    m = 0
    m = a + b
    count += 1
    a = b
    b = int(m % 10)
    l = a * 10 + b
    if (l == n):
        print(count)
        break