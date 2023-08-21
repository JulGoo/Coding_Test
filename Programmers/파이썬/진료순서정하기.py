# https://school.programmers.co.kr/learn/courses/30/lessons/120835

def solution(emergency):
    answer = []
    new = sorted(emergency, reverse=True)
    for i in range(len(new)):
        n = new.index(emergency[i]) + 1
        answer.append(n)
    return answer


a = [1, 2, 3, 4, 5, 6, 7]
print(solution(a))
