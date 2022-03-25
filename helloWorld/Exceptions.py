try:
    age = int(input('Age: '))
    income = int(input('Income: '))
    risk = income / age
    print(f'You\'re {age} yo.')
except ValueError:
    print('Age must an int.')
except ZeroDivisionError:
    print('Age cannot be zero.')