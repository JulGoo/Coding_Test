# 5432. 쇠막대기 자르기
# https://swexpertacademy.com/main/solvingProblem/solvingProblem.do

# v.1
T = int(input())

for tc in range(T):
    stick = []
    cnt = 0
    S = list(input())

    for i in range(len(S)):
        if S[i] == '(':
            stick.append(i)
        else:
            stick.pop()
            if S[i - 1] == '(':
                cnt += len(stick)
            else:
                cnt += 1

    print(f"#{tc + 1} {cnt}")

# v.2
# T = int(input())
#
# for tc in range(1, T + 1):
#     S = input()
#     stack = 0
#     result = 0
#     for i in range(len(S)):
#         if S[i] == '(':
#             stack += 1
#         else:
#             stack -= 1
#             if S[i-1] == '(':
#                 result += stack
#             else:
#                 result += 1
#     print(f"#{tc} {result}")
