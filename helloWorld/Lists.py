nums = [1, 0, 30, 0, 117, 101, 1, -10, 30]
other_nums = [1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,3]
uniques = []
for num in other_nums:
    if num not in uniques:
        uniques.append(num)
print(f'''
    nums: {nums}
    uniques: {uniques}
''')
