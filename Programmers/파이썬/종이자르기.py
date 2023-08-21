# https://school.programmers.co.kr/learn/courses/30/lessons/120922

def solution(M, N):
    # answer = 0
    # count = 0
    # while (M != 1):
    #     count += 1
    #     M -= 1
    # answer = (N - 1) * (count + 1) + count

    return (M*N)-1


# (M*N)-1

print(solution(int(input()), int(input())))
