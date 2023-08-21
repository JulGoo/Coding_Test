# https://school.programmers.co.kr/learn/courses/30/lessons/70129

def solution(s):
    answer = []
    zero = 0
    binary = 0
    slen = 0
    count = 0
    while (binary != '1'):
        zero += s.count('0')
        s = s.replace("0", "")
        slen = len(s)
        binary = bin(slen).replace("0b", "")
        count += 1
        s = binary
    answer.append(count)
    answer.append(zero)
    return answer

print(solution(input()))
