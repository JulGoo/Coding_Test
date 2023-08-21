# https://school.programmers.co.kr/learn/courses/30/lessons/120880

def solution(numlist, n):
    answer = []
    diff = []
    distance = []
    for i in range(len(numlist)):
        diff.append(numlist[i] - n)
        distance.append(abs(numlist[i] - n))
    print(diff)
    print(distance)

    distance.sort()

    print(distance)

    for i in range(len(distance)):
        if distance[i] == distance[i - 1] and i != 0:
            distance[i] = -distance[i - 1]
        elif distance[i] not in diff:
            distance[i] = -distance[i]
    print(distance)

    for i in range(len(distance)):
        answer.append(distance[i] + n)

    return answer


a = [10000, 20, 36, 47, 40, 6, 10, 7000]
b = 30

c = [1, 2, 3, 4, 5, 6]
d = 4

#print(solution(a, b))
print(solution(c, d))




# def solution(numlist, n):
#     answer = sorted(numlist,key = lambda x : (abs(x-n), n-x))
#     return answer
