# url: https://www.acmicpc.net/problem/10026

import sys

n = int(sys.stdin.readline())

m = []
m2 = []
for _ in range(n):
    line = sys.stdin.readline().rstrip()
    m.append([c for c in line])
    m2.append([('R' if c == 'R' or c == 'G' else c) for c in line])


def bfs(i, j, number):
    visit = [[i, j]]
    queue = [[i, j]]

    while queue:
        c = queue.pop(0)
        c_i = c[0]
        c_j = c[1]

        if c_i + 1 < n and rbm[c_i + 1][c_j] in ['R', 'G', 'B'] and rbm[c_i][c_j] == rbm[c_i + 1][c_j] and [c_i + 1, c_j] not in visit:
            queue.append([c_i + 1, c_j])
            visit.append([c_i + 1, c_j])

        if c_j + 1 < n and rbm[c_i][c_j + 1] in ['R', 'G', 'B'] and rbm[c_i][c_j] == rbm[c_i][c_j + 1] and [c_i, c_j + 1] not in visit:
            queue.append([c_i, c_j + 1])
            visit.append([c_i, c_j + 1])

        if c_i - 1 >= 0 and rbm[c_i - 1][c_j] in ['R', 'G', 'B'] and rbm[c_i][c_j] == rbm[c_i - 1][c_j] and [c_i - 1, c_j] not in visit:
            queue.append([c_i - 1, c_j])
            visit.append([c_i - 1, c_j])

        if c_j - 1 >= 0 and rbm[c_i][c_j - 1] in ['R', 'G', 'B'] and rbm[c_i][c_j] == rbm[c_i][c_j - 1] and [c_i, c_j - 1] not in visit:
            queue.append([c_i, c_j - 1])
            visit.append([c_i, c_j - 1])

        rbm[c_i][c_j] = number

        # print(visit)
        # print(queue)


rbm = m[:]
count = 0
for x in range(n):
    for y in range(n):
        if rbm[x][y] in ['R', 'G', 'B']:
            # print('bm', rbm)
            bfs(x, y, count)
            # print('am', rbm)
            count += 1

rbm = m2[:]
count2 = 0
for x in range(n):
    for y in range(n):
        if rbm[x][y] in ['R', 'G', 'B']:
            # print('bm', rbm)
            bfs(x, y, count2)
            # print('am', rbm)
            count2 += 1

print(str(count) + ' ' + str(count2))