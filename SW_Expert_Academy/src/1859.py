# 1859. 백만장자 프로젝트

T = int(input())

for testcase in range(1, T + 1):
    days = int(input())

    prices = list(map(int, input().split()))

    earn = 0
    buy = []

    compare = days - 1
    for i in range(days - 2, -2, -1):  # i = ~ -1
        if prices[compare] > prices[i] and i >= 0:
            buy.append(prices[i])
        else:
            earn += prices[compare] * len(buy) - sum(buy)
            compare = i
            buy = []

    print(f"#{testcase} {earn}")
