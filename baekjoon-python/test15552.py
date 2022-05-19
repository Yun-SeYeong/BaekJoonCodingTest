# url: https://www.acmicpc.net/problem/15552
import sys
t = int(sys.stdin.readline())

for i in range(1, t+1):
    ab = [int(i) for i in sys.stdin.readline().rstrip().split(' ')]
    print(ab[0] + ab[1])
