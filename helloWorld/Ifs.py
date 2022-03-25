# If statements
# 1
# is_day_hot = False
# is_day_cold = False
# if is_day_hot:
#     print("It's hot today.\nDrink plenty of water.")
# elif is_day_cold:
#     print("It's cold today.\nWear warm clothes, please.")
# else:
#     print("Today is a beautiful day... ideal we could say!")

# 2
# import locale
# locale.setlocale(locale.LC_ALL, 'English_United States.1252')
#
# house_price = 1_000_000
# down_payment = house_price
# has_high_income = False
# has_criminal_history = False
# has_good_credit = not has_criminal_history and has_high_income
#
# if has_good_credit:
#     down_payment = house_price * 0.1
# else:
#     down_payment = house_price * 0.25
# print(f'Down payment: {locale.currency(down_payment, grouping=True)}')

# 3
# temperature_c = int(input('Temperature [°C]: '))
#
# if temperature_c >= 30:
#     print("It's a hot day.")
# elif temperature_c <= 10:
#     print("It's a cold day.")
# else:
#     print("It's neither cold nor hot.")

# 4
# while True:
#     name = input('Name: ')
#     name_length = len(name)
#
#     if name_length > 50:
#         print('Your name can be a max. of 50 chars.')
#     elif name_length < 3:
#         print('Your name must be at least 3 chars.')
#     else:
#         print('Your name looks good!')
# 5
weight = float(input('Weight: '))
unit = input('[L]bs | [K]gs: ')
kg_to_lbs_ratio = 2.20462

if unit.lower() == 'l':
    print("You\'re {:0.2f} kg.".format(weight / kg_to_lbs_ratio))
else:
    print('You\'re {:0.2f} lbs.'.format(weight * kg_to_lbs_ratio))