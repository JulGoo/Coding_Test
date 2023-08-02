# https://school.programmers.co.kr/learn/courses/30/lessons/42748

def solution(array, commands):
    answer = []
    for n in range(len(commands)):
        i = commands[n][0]
        j = commands[n][1]
        k = commands[n][2]
        na = sorted(array[i-1:j])
        answer.append(na[k-1])
    return answer


a = [1, 5, 2, 6, 3, 7, 4]
b = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]

print(solution(a, b))
