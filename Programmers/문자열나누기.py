# https://school.programmers.co.kr/learn/courses/30/lessons/140108

def solution(s):
    same = 0
    diff = 0
    count = 0
    x = s[0]
    for i in range(len(s)):
        if s[i] == x:
            same += 1
        else:
            diff += 1
        if same == diff:
            same = 0
            diff = 0
            if i != len(s) - 1:
                x = s[i + 1]
                count += 1
        if i == len(s) - 1:
            count += 1
    return count


print(solution(input()))
