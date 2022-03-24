# (author, index): (Jakub Łukaszewski, 266485)

def symmetric_distance(a, b):
    total = 0
    for i in range(len(a[0])):
        for j in range(len(a[1])):
            total += abs(a[i][j]-b[i][j])
    return total


if __name__ == '__main__':
    p = [[3, 4, 4], [5, 5, 9], [4, 3, 7]]
    q = [[5, 1, 9], [12, 3, 21], [41, 22, 0]]

    print(symmetric_distance(p, q))
