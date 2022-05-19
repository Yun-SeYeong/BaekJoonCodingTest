# url: https://www.acmicpc.net/problem/1008

import sys
ab = [int(i) for i in sys.stdin.readline().rstrip().split(' ')]
print((ab[0] + ab[1]) % ab[2])
print(((ab[0] % ab[2]) + (ab[1] % ab[2])) % ab[2])
print((ab[0] * ab[1]) % ab[2])
print((ab[0] % ab[2]) * (ab[1] % ab[2]) % ab[2])
