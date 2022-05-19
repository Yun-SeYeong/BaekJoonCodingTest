# url: https://www.acmicpc.net/problem/16236

n = int(input())

m = []
for i in range(n):
    m.append([int(x) for x in input().split(" ")])

# print('n', n)
# print('m', m)

sh_x = 0
sh_y = 0
sh_size = 2
sh_eat = 0

result = 0

for i in range(n):
    for j in range(n):
        if m[i][j] == 9:
            sh_x = j
            sh_y = i


def dfs(root):
    visit = [root]
    queue = [root]

    length = 0
    while queue:
        # print('visit', visit)
        # print('queue', queue)
        tmp_queue = []
        tmp_target = []
        length += 1
        for node in queue:
            if node[1] - 1 >= 0 and [node[0], node[1] - 1] not in visit and m[node[1] - 1][node[0]] <= sh_size:
                if 0 < m[node[1] - 1][node[0]] < sh_size:
                    tmp_target.append([node[0], node[1] - 1])
                visit.append([node[0], node[1] - 1])
                tmp_queue.append([node[0], node[1] - 1])
            if node[0] - 1 >= 0 and [node[0] - 1, node[1]] not in visit and m[node[1]][node[0] - 1] <= sh_size:
                if 0 < m[node[1]][node[0] - 1] < sh_size:
                    tmp_target.append([node[0] - 1, node[1]])
                visit.append([node[0] - 1, node[1]])
                tmp_queue.append([node[0] - 1, node[1]])
            if node[0] + 1 < n and [node[0] + 1, node[1]] not in visit and m[node[1]][node[0] + 1] <= sh_size:
                if 0 < m[node[1]][node[0] + 1] < sh_size:
                    tmp_target.append([node[0] + 1, node[1]])
                visit.append([node[0] + 1, node[1]])
                tmp_queue.append([node[0] + 1, node[1]])
            if node[1] + 1 < n and [node[0], node[1] + 1] not in visit and m[node[1] + 1][node[0]] <= sh_size:
                if 0 < m[node[1] + 1][node[0]] < sh_size:
                    tmp_target.append([node[0], node[1] + 1])
                visit.append([node[0], node[1] + 1])
                tmp_queue.append([node[0], node[1] + 1])

        tmp_target = sorted(tmp_target, key=lambda a: (a[1], a[0]))
        if len(tmp_target) > 0:
            return tmp_target[0], length

        queue = tmp_queue[:]


while True:
    dfs_result = dfs([sh_x, sh_y])
    target_pos = None
    dist = 0

    if dfs_result is not None:
        target_pos, dist = dfs_result
        # print("target_pos", target_pos)
        # print("{dist:", dist, "}")

        sh_eat += 1
        result += dist
        if sh_size <= sh_eat and sh_size < 7:
            sh_size += 1
            sh_eat = 0
        # print("{sh_size:", sh_size, "}")
    else:
        break

    m[sh_y][sh_x] = 0
    m[target_pos[1]][target_pos[0]] = 9
    sh_x = target_pos[0]
    sh_y = target_pos[1]
    # print(m)

print(result)