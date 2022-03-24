# (author, index): (Jakub Łukaszewski, 266485)
import numpy as np


def is_correct(r, d):
    values_1 = np.array(r)
    values_2 = np.array(d)
    column_1 = values_1[:, 1]
    column_2 = values_2[:, 0]
    exists = [False, False, False]
    for i, nr in enumerate(column_1):
        for j, nr_d in enumerate(column_2):
            if nr == nr_d:
                exists[i] = True
    return exists


def bills(r, d):
    r_1 = np.array(r)
    d_1 = np.array(d)
    total = [0, 0, 0]
    for i, good in enumerate(r_1[:, 1]):
        for j, good_d in enumerate(d_1[:, 0]):
            if good == good_d:
                total[i] += round(d_1[i][1]*r_1[j][2], 2)
    return total


if __name__ == '__main__':
    # apiece - True, otherwise - False
    r = [[0, 103, 4], [1, 101, 9], [2, 100, 7]]
    d = [[101, 4.99, True], [103, 6.80, False], [100, 5.04, True]]

    # 1
    # print(is_correct(r, d))
    # 2
    print(bills(r, d))