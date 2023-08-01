# 14555. 공과 잡초

T = int(input())
ball = 0

for tc in range(1, T + 1):
    S = input()
    ball = S.count('()') + S.count('(|') + S.count('|)')

    print(f"#{tc} {ball}")
