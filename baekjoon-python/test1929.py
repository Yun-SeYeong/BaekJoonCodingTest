# url: https://www.acmicpc.net/problem/1929

m, n = [int(i) for i in input().split(" ")]

result = [True, True] + [True]*(n - 2)
# print(result)
for i in range(2, n+1):
    if result[i-1]:
        if i >= m:
            print(i)
        for j in range(2, int(n/i)+1):
            # print(j)
            result[j*i-1] = False
        # print(result)


# for i in range(m, n+1):
#     # print(i)
#     if i == 1 or i == 2 or i == 3:
#         print(i)
#     else:
#         is_odd = True
#         for j in range(2, int(i ** 0.5)+1):
#             # print('j', j)
#             if i % j == 0:
#                 is_odd = False
#         if is_odd:
#             # result.append(i)
#             print(i)


# print('result', result)