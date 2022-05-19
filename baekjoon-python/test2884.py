# url: https://www.acmicpc.net/problem/2884

import sys
h, m = [int(i) for i in sys.stdin.readline().rstrip().split(' ')]

if m < 45:
    m = m + 60 - 45
    h -= 1
else:
    m -= 45

if h < 0:
    h += 24

print(h, m)
