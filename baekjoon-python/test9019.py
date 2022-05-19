# url: https://www.acmicpc.net/problem/9019

from collections import deque
import sys


def bfs():
    visit = [False] * 10000

    while queue:
        node_value = queue.popleft()

        node = node_value[0]
        node_str = node_value[1]

        if node == b:
            print(node_str)

        d_node = (node * 2) % 10000

        if not visit[d_node]:
            queue.append((d_node, node_str + "D"))
            visit[d_node] = True

        s_node = node
        if s_node == 0:
            s_node = 9999
        else:
            s_node -= 1

        if not visit[s_node]:
            queue.append((s_node, node_str + "S"))
            visit[s_node] = True

        l_node = (node % 1000) * 10 + node // 1000

        if not visit[l_node]:
            queue.append((l_node, node_str + "L"))
            visit[l_node] = True

        r_node = node // 10 + (node % 10 * 1000)

        if not visit[r_node]:
            queue.append((r_node, node_str + "R"))
            visit[r_node] = True


t = int(sys.stdin.readline())

queue = deque([])
result = []

for i in range(t):
    a, b = [int(x) for x in sys.stdin.readline().rstrip().split(" ")]
    queue.clear()
    queue.append((a, ""))
    result.append(bfs())


# D S L R DD DS DL DR SD SS SL SR
# 0 1 2 3 10 11 12 13 20 21 22 23