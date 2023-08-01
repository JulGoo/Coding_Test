# 3234. 준환이의 양팔저울
import random

T = int(input())

for tc in range(1, T + 1):
    N = int(input())  # 무게 추 개수
    weight = list(map(int, input().split()))
    r = []
    l = []

