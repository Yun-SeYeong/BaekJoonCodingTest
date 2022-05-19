# url: https://www.acmicpc.net/problem/5430

t = int(input())
# print()

result = []

for i in range(t):
    p = input()
    n = int(input())
    x_list = input()
    x_list = [int(x) for x in (x_list[1:-1].split(",") if len(x_list) > 2 else [])]

    # j = 0
    # while j < len(p) - 1:
    #     if p[j] == p[j+1] == 'R':
    #         p = p[:j] + p[j+2:]
    #     else:
    #         j += 1
    # print(p)

    # print('p', p)
    # print('n', n)
    # print('x_list', x_list)

    reverse_flag = True
    for c in p:
        # print('cmd: ', c)

        if c == 'R':
            reverse_flag = not reverse_flag
        elif c == 'D':
            if len(x_list) < 1:
                x_list = 'error'
                break
            if reverse_flag:
                del x_list[0]
            else:
                del x_list[-1]

        # print('-->', x_list)

    if not reverse_flag and x_list != 'error':
        x_list = x_list[::-1]
    # print('str(x_list)', str(x_list).replace(" ", ""))
    result.append(str(x_list).replace(" ", ""))

for r in result:
    print(r)
