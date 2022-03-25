# 1
# import collections
# from builtins import list
#
#
# def shift_list(a_list, offset):
#     dequed = collections.deque(a_list)
#     dequed.rotate(offset)
#     return list(dequed)
#
#
# fruit = ['apple', 'banana', 'orange', 'coconut']
# offset_list = shift_list(fruit, -1)
# print(f'''
#     Original list: {fruit}
#     Offset list: {offset_list}
# ''')

# 2
# def is_surname_letter_greater(surname, letter):
#     if surname[0] > letter:
#         return True
#     else:
#         return False
#
#
# def print_letter_greater_surnames(surnames, letter):
#     print(f'Surnames with first letters grater than {letter}')
#     for surname in surnames:
#         if is_surname_letter_greater(surname, letter):
#             print(surname)
#     print('\n')
#
#
# def print_surnames_longer_than_alf(surnames, length):
#     print(f'Surnames longer than {length}')
#     sorted_surnames = surnames
#     for surname in sorted_surnames:
#         if len(surname) <= length:
#             sorted_surnames.remove(surname)
#     sorted_surnames.sort()
#     for surname in sorted_surnames:
#         print(surname)
#
#
# surnames = []
# print('Enter surnames separated by \'Enter\'\n')
#
# i = 0
# while i < 5:
#     surname = input(f'#{i+1} > ').title()
#     if surname.isalpha():
#         surnames.append(surname)
#         i += 1
#     else:
#         print('Not a surname! Try once again.')
#
# print('\n')
# print_letter_greater_surnames(surnames, 'K')
# print_surnames_longer_than_alf(surnames, 5)

# 3
import datetime


while True:
    milk_brand = input('Enter a brand: ')
    if not milk_brand.isalpha():
        print('Not a brand. Try once again!')
        continue
    break
while True:
    try:
        milk_price = float(input('Enter a price: '))
    except ValueError:
        print('Once again!')
        continue
    if not type(milk_price) == float:
        print('Not a price. Try once again!')
        continue
    break
while True:
    try:
        milk_capacity = int(input('Enter a capacity: '))
    except ValueError:
        print('Once again!')
        continue
    if not type(milk_capacity) == int:
        print('Not a capacity. Try once again!')
        continue
    break

expiration_date = (2021, 12, 13)
brand = 'Pilos'
milk_carton = {
    'brand': milk_brand,
    'price_pln': milk_price,
    'capacity_ml': milk_capacity,
    'expiration_date': datetime.date(year=expiration_date[0], month=expiration_date[1], day=expiration_date[2]).strftime("%d.%m.%Y")
}

wanted_price = "{:.2f} zł".format(milk_carton.get("price_pln") * 6)
print(f'''
    --- Milk Showcase ---
    Brand: \t\t\t\t{milk_carton.get("brand").title()}
    Price: \t\t\t\t{"{:.2f} zł".format(milk_carton.get("price_pln"))}
    Capacity: \t\t\t{"{} ml".format(milk_carton.get("capacity_ml"))}
    Expiration date: \t{milk_carton.get("expiration_date")}

    Price of 6 milk cartons: {wanted_price}
''')
