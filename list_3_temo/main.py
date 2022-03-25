# (author, index): (Jakub Łukaszewski, 266485)

# 1
# def show_ticket_price(age):
#     normal_pln = '{:.2f} zł'.format(27)
#     student_pln = '{:.2f} zł'.format(22)
#     free_pln = '{:.2f} zł'.format(0)
#     student_age_limit = 26
#     child_age_limit = 6
#
#     if age <= 0:
#         print('age cannot be negative or equal to zero')
#     elif age <= child_age_limit:
#         print(free_pln)
#     elif age <= student_age_limit:
#         print(student_pln)
#     else:
#         print(normal_pln)
#
#
# print('''
#     This program returns a ticket price based on given age.
#     Enter '0' for help.
# ''')
# while True:
#     try:
#         command = int(input('> '))
#     except ValueError:
#         print('Enter a valid integer value, please.')
#         continue
#     if command == 0:
#         print('''
#     Command\tDesc
#     [age]\tticket price
#     '0'\t\thelp
#     '-1'\tquit
#     '-2'\tinfo
#         ''')
#     elif command == -1:
#         break
#     elif command == -2:
#         print('''
#     -- Tariff --
#     Age\t\tPrice
#     (0;6]\t0.00 zł
#     (6;26]\t22.00 zł
#     (26;+∞)\t27.00 zł
#         ''')
#     else:
#         show_ticket_price(int(command))


# 2
# import math
#
#
# def get_num_of_solutions_of_q_equation(discriminant):
#     if a == 0:
#         return 'This equation is not quadratic!'
#     elif discriminant > 0:
#         return 2
#     elif discriminant == 0:
#         return 1
#     else:
#         return 0
#
#
# def get_solutions_of_q_equation(a, b, discriminant):
#     if a == 0:
#         return 'This equation is not quadratic!'
#     elif discriminant > 0:
#         x1 = '{:.2f}'.format((-b - math.sqrt(discriminant)) / (2 * a))
#         x2 = '{:.2f}'.format((-b + math.sqrt(discriminant)) / (2 * a))
#         return x1, x2
#     elif discriminant == 0:
#         x1 = '{:.2f}'.format((-b) / (2 * a))
#         return x1
#     else:
#         return 'None'
#
# def get_discriminant(a, b, c):
#     return math.pow(b, 2) - 4 * a * c
#
#
# while True:
#     try:
#         coefficients = [float(input('A = ')), float(input('B =  ')), float(input('C = '))]
#     except ValueError:
#         print('Coefficient must be real numbers. Try again!')
#         continue
#
#     a, b, c = coefficients
#     discriminant = get_discriminant(a, b, c)
#     num_of_solutions = get_num_of_solutions_of_q_equation(discriminant)
#
#     print(f'''
#     --- Results ---
#     # of solutions: {get_num_of_solutions_of_q_equation(discriminant)}
#     Solutions: {get_solutions_of_q_equation(a, b, discriminant)}
#     ''')
#     break


# 3
def is_even(num):
    if num % 2 == 0:
        return True
    else:
        return False


def average(nums):
    sum = 0
    for num in nums:
        sum += num
    return sum / len(nums)


nums = []
print('Enter numbers separated by \'Enter\'\n[Nonnumerical character] - indication of last number\n')
while True:
    try:
        i = len(nums) + 1
        nums.append(float(input(f'#{i} > ')))
        continue
    except ValueError:
        print('solving ...')

    avg = average(nums)
    rounded = round(avg)
    print(f'''
    Average: {'{:.3f}'.format(avg)}
    Rounded: {rounded}
    Even: {is_even(rounded)}
    ''')
