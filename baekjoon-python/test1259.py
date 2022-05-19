# url: https://www.acmicpc.net/problem/1259

word = ""
result = []

while True:
    word = input()
    if word == "0":
        break
    word_len = len(word)
    word_len = word_len if word_len%2 == 0 else word_len-1
    if word == word[::-1]:
        result.append("yes")
    else:
        result.append("no")

for r in result:
    print(r)
