# (author, index): (Jakub Łukaszewski, 266485)
import math


def normalize(arr=[]):
    denominator = 0
    for e in arr:
        denominator += e ** 2
    denominator = math.sqrt(denominator)

    normalized = arr
    for i in range(len(normalized)):
        normalized[i] = arr[i] / denominator
    return normalized


if __name__ == '__main__':
    data = [2.2, 5.6, 4.3, 3.0, 0.5]
    for elem in normalize(data):
        print(elem)
