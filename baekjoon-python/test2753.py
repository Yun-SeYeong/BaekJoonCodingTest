# url: https://www.acmicpc.net/problem/2753

y = int(input())

if y % 4 == 0 and (y % 100 > 0 or y % 400 == 0):
    print('1')
else:
    print('0')