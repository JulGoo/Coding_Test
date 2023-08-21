# https://school.programmers.co.kr/learn/courses/30/lessons/133499


def solution(babbling):
    answer = 0
    babblings = ["aya", "ye", "woo", "ma"]
    for i in range(len(babbling)):
        if "ayaaya" in babbling[i] or "yeye" in babbling[i] \
                or "woowoo" in babbling[i] or "mama" in babbling[i]:
            continue
        a = babbling[i].count("aya")
        b = babbling[i].count("ye")
        c = babbling[i].count("woo")
        d = babbling[i].count("ma")

        result = len(babbling[i]) - a * 3 - b * 2 - c * 3 - d * 2

        if result == 0:
            answer += 1

    return answer


a = ["aya", "yee", "u", "maa"]
b = ["ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"]

print(solution(a))
print(solution(b))
