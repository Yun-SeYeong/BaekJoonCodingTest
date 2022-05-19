# url: https://www.acmicpc.net/problem/1085

x, y, w, h = [int(i) for i in input().split(" ")]

# print('x', x)
# print('y', y)
# print('w', w)
# print('h', h)

result = [x, y, w - x, h - y]

# print('result', result)
print(min(result))
