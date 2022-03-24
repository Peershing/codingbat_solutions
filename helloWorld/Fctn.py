def greet_user(f_name, l_name):
    print(f'\nGood morning, {f_name}!\nWelcome aboard {l_name}')


def get_salary(wage, hours, extra_wage, extra_hours):
    return "${:,.2f}".format(wage * hours + extra_wage * extra_hours)


f_name = input('First name: ').capitalize()
l_name = input('Last name: ').capitalize()
greet_user(f_name, l_name)
print(f'Salary: {get_salary(wage=35,extra_wage=40,hours=160,extra_hours=5)}')
