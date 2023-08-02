# https://school.programmers.co.kr/learn/courses/30/lessons/12910

def solution(arr, divisor):
    answer = []
    for i in range(len(arr)):
        if arr[i] % divisor == 0:
            answer.append(arr[i])
        else:
            continue
    if len(answer) == 0:
        answer.append(-1)
    return sorted(answer)


a = list(map(int, input().split()))
b = int(input())

print(solution(a, b))
