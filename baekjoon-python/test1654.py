# url: https://www.acmicpc.net/problem/1654

k, n = [int(i) for i in input().split(" ")]

wire_lens = []
for i in range(k):
    wire_lens.append(int(input()))

wire_lens.sort(reverse=True)
min_len = wire_lens[0]

start = 1
end = min_len


def check(check_len):
    t = 0
    for wl in wire_lens:
        t += int(wl/check_len)
    return t

result = min_len
while start <= end:
    mid = (start+end)//2
    # print('start', start)
    # print('mid', mid)
    # print('end', end)
    # print('check(mid)', check(mid))
    ch = check(mid)
    if n <= ch:
        start = mid + 1
        result = mid
    elif n > ch:
        end = mid - 1

print(result)
# count = 0
# i = 1
#
# while True:
#     for wl in wire_lens:
#         count = 0
#         for w in wire_lens:
#             count += int(w/int(wl/i))
#         # print('(wl/i)', int(wl/i))
#         print('count', count)
#         # print('n', n)
#         print(int(wl / i))
#         if count == n:
#             # print(int(wl / i))
#             break
#     if count == n:
#         break
#     i += 1

# print('result', count)


