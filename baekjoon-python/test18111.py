# url: https://www.acmicpc.net/problem/18111

n, m, b = [int(i) for i in input().split(" ")]

block_map = []
min_h = 256
max_h = 0
for i in range(n):
    [block_map.append(int(x)) for x in input().split(" ")]
min_h = min(block_map)
max_h = max(block_map)

# print(block_map)
# print(min_h)
# print(max_h)

result_time = None
result_h = 0

result = set()

for i in range(min_h, max_h+1):
    coast = 0
    b_backup = b
    # print('bb', b)
    for x in range(n*m):
        t = block_map[x]
        # print('i -->', i)
        # print('t -->', t)
        if i - t > 0:
            b -= i-t
            coast += i - t
        elif i - t < 0:
            b += t - i
            coast += (t - i) * 2
        # print('b -->', b)
    # print('i', i)
    # print('b', b)
    # print('coast', coast)

    if b >= 0:
        result.add((coast, i))

    b = b_backup

result = sorted(result, key=lambda x: (x[0], -x[1]))
# print(result)
print(result[0][0], result[0][1])
