# (author, index): (Jakub Łukaszewski, 266485)


def num_divisible(n: int):
    return (lambda s: s % 3 == 0 or s % 5 == 0)(n)


if __name__ == '__main__':
    arr = range(0, 51)
    result = filter(num_divisible, arr)
    for e in result:
        print(e)
