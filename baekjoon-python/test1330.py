# url: https://www.acmicpc.net/problem/1330

import sys
a, b = sys.stdin.readline().rstrip().split(' ')
a = int(a)
b = int(b)

if a < b:
    print('<')
elif a > b:
    print('>')
elif a == b:
    print('==')
