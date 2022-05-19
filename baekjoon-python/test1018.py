# url : https://www.acmicpc.net/problem/1018

board = []

# input_str = input()
# print(input_str)

n, m = [int(i) for i in input().split(" ")]
for i in range(int(n)):
    l = input()
    line = []
    for j in range(int(m)):
        line.append(l[j])
    board.append(line)

# print('n', n)
# print('m', m)
# print(board)

x = n - 8 + 1
y = m - 8 + 1

result = n*m

# print('x', x)
# print('y', y)

for i in range(x):
    for j in range(y):
        # print('i', i)
        # print('j', j)
        count = 0
        for z in range(i, i+8):
            for k in range(j, j+8):
                # print('z', z)
                # print('k', k)
                # print('check_board[z][k]', board[z][k])
                if z % 2 == 0 and k % 2 == 0 and board[z][k] == 'B':
                    count += 1
                elif z % 2 == 1 and k % 2 == 0 and board[z][k] == 'W':
                    count += 1
                elif z % 2 == 0 and k % 2 == 1 and board[z][k] == 'W':
                    count += 1
                elif z % 2 == 1 and k % 2 == 1 and board[z][k] == 'B':
                    count += 1
        if count < result:
            result = count

        count = 0
        for z in range(i, i+8):
            for k in range(j, j+8):
                # print('z', z)
                # print('k', k)
                # print('check_board[z][k]', board[z][k])
                if z % 2 == 0 and k % 2 == 0 and board[z][k] == 'W':
                    count += 1
                elif z % 2 == 1 and k % 2 == 0 and board[z][k] == 'B':
                    count += 1
                elif z % 2 == 0 and k % 2 == 1 and board[z][k] == 'B':
                    count += 1
                elif z % 2 == 1 and k % 2 == 1 and board[z][k] == 'W':
                    count += 1
        if count < result:
            result = count

print(result)


