# url: https://www.acmicpc.net/problem/2805

n, m = [int(i) for i in input().split(" ")]
trees = [int(i) for i in input().split(" ")]

s_h = 0
e_h = max(trees)
result = -1

while s_h < e_h:
    m_h = (s_h + e_h) // 2
    # print('s-->', s_h)
    # print('e-->', e_h)
    # print('m-->', m_h)
    target = 0
    for tree in trees:
        target += tree - m_h if (tree - m_h) > 0 else 0
    # print('target-->', target)
    if target >= m:
        s_h = m_h + 1
        result = m_h
    else:
        e_h = m_h


print(result)
