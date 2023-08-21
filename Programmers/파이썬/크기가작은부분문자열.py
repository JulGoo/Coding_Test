# https://school.programmers.co.kr/learn/courses/30/lessons/147355

def solution(t, p):
    answer = 0
    for i in range(len(t)):
        cut = t[i:i + len(p)]
        if len(cut) != len(p):
            continue
        if int(cut) <= int(p):
            answer += 1
            print(cut, "cut")
    return answer


a = "500220839878"
b = "7"
print(solution(a, b))
