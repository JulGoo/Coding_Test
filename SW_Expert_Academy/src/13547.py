# 13547. 팔씨름

T = int(input())

for test_case in range(1, T + 1):
    S = []
    S = input()
    k = len(S)

    if k <= 7:
        print(f"#{test_case} YES")
    else:
        if k - S.count("o") <= 7:
            print(f"#{test_case} YES")
        else:
            print(f"#{test_case} NO")
