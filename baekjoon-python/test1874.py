# url: https://www.acmicpc.net/problem/1874

stack = []
result = []

n = int(input())

input_nums = []
for i in range(n):
    input_nums.append(int(input()))

input_queue = list(range(1, n+1))
# print('input_queue', input_queue)

i = 0
m = []
while len(result) < n:
    # print('stack', stack)
    # print('result', result)
    if len(stack) > 0 and stack[-1] == input_nums[len(result)]:
        m.append("-")
        r = stack.pop(len(stack) - 1)
        result.append(r)
    elif len(input_queue) > 0:
        num = input_queue.pop(0)
        # print('num', num)
        # print('value', input_nums[len(result)])

        if num <= input_nums[len(result)]:
            m.append("+")
            stack.append(num)
    else:
        print("NO")
        break

if len(m) == n*2:
    for m_value in m:
        print(m_value)

# print('stack', stack)
# print('result', result)