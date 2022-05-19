# url: https://www.acmicpc.net/problem/1107

n = int(input())
m = int(input())
if m > 0:
    broken_list = [int(i) for i in input().split(" ")]

    b_list = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]

    # print('n', n)
    # print('m', m)
    # print('broken_list', broken_list)
    # print('b_list', b_list)

    for b in broken_list:
        b_list[b] = None

    # print('after b_list', b_list)


    def bfs(root):
        queue = [root]

        count = 0

        min_result = 500001

        while queue:
            count += 1
            # print('queue', queue)
            tmp_queue = []
            for node in queue:
                for b in b_list:
                    if b is not None and node != "0":
                        tmp_queue.append(node + b)

            # print('tmp_queue', tmp_queue)

            value_list = []
            for tq in tmp_queue:
                value_list.append(abs(n - int(tq)))

            # print('value_list', value_list)

            min_value = 500001
            if len(tmp_queue) > 0:
                min_value = min(value_list)

            # print('min_value', min_value)

            if min_result <= min_value:
                return (count - 1) + min_result

            min_result = min_value

            queue = tmp_queue[:]


    bfs_result = bfs("")

    if abs(n - 100) <= bfs_result:
        print(abs(n - 100))
    else:
        print(bfs_result)
else:
    result = len(str(n))
    if abs(n - 100) <= result:
        print(abs(n - 100))
    else:
        print(result)



