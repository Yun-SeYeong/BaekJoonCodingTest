# url: https://www.acmicpc.net/problem/14681

import sys
x = int(sys.stdin.readline())
y = int(sys.stdin.readline())

if x > 0 and y > 0:
    print(1)
elif x > 0 and y < 0:
    print(4)
elif x < 0 and y > 0:
    print(2)
elif x < 0 and y < 0:
    print(3)
