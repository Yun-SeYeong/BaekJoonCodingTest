# url: https://www.acmicpc.net/problem/7662
import sys
import heapq
t = int(sys.stdin.readline())

result = []

for i in range(t):
    k = int(sys.stdin.readline())
    q_max = []
    q_min = []

    del_max = 0
    del_min = 0

    id = [False] * 1000000

    for j in range(k):
        m, v = sys.stdin.readline().rstrip().split(" ")
        v = int(v)

        if m == 'I':
            heapq.heappush(q_max, (-1 * v, j))
            heapq.heappush(q_min, (v, j))
            id[j] = True
        elif m == 'D':
            if v > 0:
                while q_max and not id[q_max[0][1]]:
                    heapq.heappop(q_max)
                if q_max:
                    id[q_max[0][1]] = False
                    heapq.heappop(q_max)
            else:
                while q_min and not id[q_min[0][1]]:
                    heapq.heappop(q_min)
                if q_min:
                    id[q_min[0][1]] = False
                    heapq.heappop(q_min)
        # print('-->', q)

    while q_max and not id[q_max[0][1]]:
        heapq.heappop(q_max)
    while q_min and not id[q_min[0][1]]:
        heapq.heappop(q_min)

    if len(q_max) > 0 and len(q_min) > 0:
        result.append(str(q_max[0][0]*-1) + " " + str(q_min[0][0]))
    else:
        result.append('EMPTY')

for r in result:
    print(r)

