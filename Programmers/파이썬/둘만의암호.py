# https://school.programmers.co.kr/learn/courses/30/lessons/155652#

def solution(s, skip, index):
    answer = ''
    for char in s:
        ns = ord(char)
        count = index
        while count != 0:
            ns += 1
            if ns > ord('z'):
                ns = ns - ord('z') + ord('a') - 1
                # 124 -> 98(b)
                # 124 - 122 + 97 - 1
            if chr(ns) not in skip:
                count -= 1
            else:
                continue
        answer += chr(ns)

    return answer


a = input()
b = input()
c = int(input())

print(solution(a, b, c))
