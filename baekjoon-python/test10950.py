# url: https://www.acmicpc.net/problem/10950

import sys
t = int(sys.stdin.readline())

for i in range(t):
    a, b = [int(i) for i in sys.stdin.readline().rstrip().split(' ')]
    print(a + b)
