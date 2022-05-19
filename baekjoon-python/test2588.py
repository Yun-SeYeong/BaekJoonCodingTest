# url: https://www.acmicpc.net/problem/2588

first = int(input())
second = int(input())

print(first * (second % 10))
print(first * ((second // 10) % 10))
print(first * ((second // 100) % 10))
print(first * second)