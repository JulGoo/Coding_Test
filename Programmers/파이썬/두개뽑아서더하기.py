# https://school.programmers.co.kr/learn/courses/30/lessons/68644

def solution(numbers):
    answer = []
    result = []
    for i in range(len(numbers)):
        for j in range(len(numbers)):
            if i != j:
                result.append(int(numbers[i]) + int(numbers[j]))
            else:
                continue
    myset = set(result)
    answer = sorted(list(myset))
    return answer


print(solution(input()))
