# (author, index): (Jakub Łukaszewski, 266485)

import numpy as np


def failed_n_lectures(arr, limit):
    count = 0
    for student in arr:
        failed = 0
        for grade in student:
            if grade < 3:
                failed += 1
        if failed >= limit:
            count += 1
    return count


def gpa(grades):
    sum = 0
    for g in grades:
        sum += g
    return sum/len(grades)


def gpas(arr):
    values = np.apply_along_axis(gpa, 1, arr)
    index_min = np.argmin(values)
    index_max = np.argmax(values)
    return index_min, index_max


def gpas_limit(arr, limit):
    values = np.apply_along_axis(gpa, 1, arr)
    modified = np.array(values)
    bool_arr = modified >= limit
    return np.where(bool_arr)[0]


def top_performer(arr):
    index = -1
    highest = -1
    count = 0
    for idx, student in enumerate(arr):
        count_l = 0
        highest_l = 0
        for g in student:
            if g > highest_l:
                count_l = 1
                highest_l = g
            elif g == highest_l:
                count += 1
        if highest_l >= highest and count_l >= count:
            count = count_l
            highest = highest_l
            index = idx
    return index


def histograms(arr, bins_val):
    values = np.array(arr)
    for i in range(len(values[0])):
        result = np.histogram(values[:, i], bins=bins_val)
        print(result)


if __name__ == '__main__':
    grades = [[3.5, 5.5, 4.5], [5.5, 4.5, 4.5], [5.5, 5, 5]]

    # 1
    # losers = failed_n_lectures(grades, 1)
    # print(losers)
    # 2
    # min_max = gpas(grades)
    # print(grades[min_max[0]], grades[min_max[1]])
    # 3
    # print(top_performer(grades))
    # 4
    # histograms(grades, [2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5])
    # 5
    # print(gpas_limit(grades, 3.5))
