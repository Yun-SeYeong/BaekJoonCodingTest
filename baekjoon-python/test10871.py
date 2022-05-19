# url: https://www.acmicpc.net/problem/10871

import sys
first = [int(i) for i in sys.stdin.readline().split(' ')]
second = [int(i) for i in sys.stdin.readline().split(' ')]
result = []
for s in second:
    if first[1] > s:
        result.append(str(s))

print(' '.join(result))