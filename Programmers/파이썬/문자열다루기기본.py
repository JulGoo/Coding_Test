# https://school.programmers.co.kr/learn/courses/30/lessons/12918?language=python3

def solution(s):
    if s.isdigit():
        if len(s) == 4 or len(s) == 6:
            answer = True
        else:
            answer = False
    else:
        answer = False

    return answer

print(solution(input()))
