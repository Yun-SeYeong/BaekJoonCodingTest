# url: https://www.acmicpc.net/problem/1181

count = int(input())
result = []
for i in range(count):
    result.append(input())

result = sorted(set(result), key=lambda x: (len(x), x))

for r in result:
    print(r)