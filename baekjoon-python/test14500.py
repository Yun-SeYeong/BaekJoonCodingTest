# url: https://www.acmicpc.net/problem/14500
import itertools
import sys
nm = [int(i) for i in sys.stdin.readline().rstrip().split(' ')]
n = nm[0]
m = nm[1]

tm = []

for i in range(n):
    tm.append([int(x) for x in sys.stdin.readline().rstrip().split(' ')])

#print(tm)

hole_visit = []
result = 0


def dfs(x, y):
    visit = []
    queue = [[x, y, tm[x][y]]]

    count = 0
    max_sum = 0

    if x < n -1 and y < m -1:
        max_sum = tm[x][y] + tm[x+1][y] + tm[x][y+1] + tm[x+1][y+1]

    while queue and count < 3:
        #print('queue', queue)
        #print('visit', visit)
        # #print('visit', visit)
        count += 1

        tmp_queue = []
        for node in queue:
            visit.append(node)
            #print('node: ', node)
            if not (count == 3 and node[0] + 1 <= hole_visit[0] and node[1] <= hole_visit[1]):
                if node[0] + 1 < n and [node[0] + 1, node[1], node[2] - tm[node[0]][node[1]]] not in visit:
                    tmp_queue.append([node[0] + 1, node[1], node[2] + tm[node[0] + 1][node[1]]])

            if not (count == 3 and node[0] - 1 < hole_visit[0] and node[1] <= hole_visit[1]):
                if node[0] - 1 >= 0 and [node[0] - 1, node[1], node[2] - tm[node[0]][node[1]]] not in visit:
                    tmp_queue.append([node[0] - 1, node[1], node[2] + tm[node[0] - 1][node[1]]])

            if not (count == 3 and node[0] <= hole_visit[0] and node[1] + 1 <= hole_visit[1]):
                if node[1] + 1 < m and [node[0], node[1] + 1, node[2] - tm[node[0]][node[1]]] not in visit:
                    tmp_queue.append([node[0], node[1] + 1, node[2] + tm[node[0]][node[1] + 1]])

            if not (count == 3 and node[0] <= hole_visit[0] and node[1] - 1 <= hole_visit[1]):
                if node[1] - 1 >= 0 and [node[0], node[1] - 1, node[2] - tm[node[0]][node[1]]] not in visit:
                    tmp_queue.append([node[0], node[1] - 1, node[2] + tm[node[0]][node[1] - 1]])

            #print('tmp_queue', tmp_queue)
            #print('count', count)

            if len(tmp_queue) >= 3 and count == 1:
                for c in list(itertools.combinations(tmp_queue, 3)):
                    c_sum = node[2]
                    for c_item in c:
                        c_sum += c_item[2] - node[2]
                    #print('c_sum: ', c_sum)
                    max_sum = c_sum if c_sum > max_sum else max_sum


        queue = tmp_queue[:]
        #print('tmp_queue[:]', tmp_queue[:])

    if len(queue) > 0:
        for q in queue:
            max_sum = q[2] if q[2] > max_sum else max_sum

        #print(max_sum)
        return max_sum
    else:
        return 0


for i in range(n):
    for j in range(m):
        hole_visit = [i, j]
        r = dfs(i, j)
        if result < r:
            result = r


print(result)
