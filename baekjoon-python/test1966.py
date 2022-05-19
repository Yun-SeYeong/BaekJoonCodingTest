# url: https://www.acmicpc.net/problem/1966

c = int(input())

result = []
for ci in range(c):
    n, m = [int(i) for i in input().split(" ")]
    q = [int(i) for i in input().split(" ")]

    q = [(i, q[i]) for i in range(len(q))]

    # print()
    # print(m)
    # print(q)
    count = 0
    while len(q) > 0:
        count += 1
        max_q = max(q, key=lambda x: x[1])
        # print('max_q', max_q)
        if max_q[0] == m:
            break

        if q[0][1] >= max_q[1]:
            max_q = q[0]

        max_i = 0

        for i, q_item in enumerate(q):
            if q_item[0] == max_q[0]:
                max_i = i

        q = q[max_i+1:] + q[:max_i]
        # print(q)
    result.append(count)
    # print (result)
    # print('count', count)

for r in result:
    print(r)
