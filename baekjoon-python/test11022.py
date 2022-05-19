# url: https://www.acmicpc.net/problem/11022

import sys
t = int(sys.stdin.readline())

for i in range(t):
    ab = [int(i) for i in sys.stdin.readline().rstrip().split(' ')]
    print('Case #' + str(i+1) + ':', ab[0], '+', ab[1], '=', ab[0] + ab[1])