# url: https://www.acmicpc.net/problem/1436

n = int(input())

i = 0
count = 666
while True:
    if "666" in str(count):
        i += 1

    if i == n:
        break
    count += 1

print(count)
