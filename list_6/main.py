# (author, index): (Jakub Łukaszewski, 266485)


# 1
from datetime import datetime, time


class Restaurant:
    def __init__(self, name, cuisine, customers_count=0):
        self.name = name
        self.cuisine = cuisine
        self.customers_count = customers_count
        self.hours = {
            'Monday': None,
            'Tuesday': [time(15, 0), time(23, 0)],
            'Wednesday': [time(15, 0), time(23, 0)],
            'Thursday': [time(15, 0), time(23, 0)],
            'Friday': [time(15, 0), time(23, 0)],
            'Saturday': [time(9, 0), time(23, 0)],
            'Sunday': [time(9, 0), time(23, 0)]
        }

    def show_description(self):
        print(f'''
        Name: \"{self.name}\"   Cuisine: {self.cuisine}   Customers: {self.customers_count}
        ''')

    def __is_closed(self, date, day):
        return True if self.hours[day] and self.hours[day][0] > date > self.hours[day][1] else False

    def is_open(self):
        day = datetime.today().strftime("%A")
        now = datetime.now().time()
        result = f'\"{self.name}\" restaurant is open.' if not \
            self.__is_closed(now, day) else f'\"{self.name}\" restaurant is closed.'
        print(result)

    def set_customers(self, number):
        if isinstance(number, int) and number >= 0:
            self.customers_count = number
        else:
            print('incorrect number of customers given')

    def add_customers(self, number):
        try:
            if isinstance(number, int) and number >= 0:
                self.customers_count += number
            else:
                print('incorrect number of customers given')
        except (TypeError, ValueError):
            print('incorrect number of customers given')

    def change_opening_hours(self, new_hours):
        try:
            for day, values in new_hours.items():
                if day not in self.hours.keys():
                    print('incorrect day')
                    break
                if values and (len(values) != 2 or any(not isinstance(value, time) for value in values)):
                    print('incorrect hours')
                    break
            else:
                self.hours.update(new_hours)
        except TypeError:
            print('incorrect format')

    def print_opening_hours(self):
        result = f'\tOpening hours of \"{self.name}\":\n'
        for day, values in self.hours.items():
            result += f'\t{day}: {" - ".join([val.strftime("%H:%M") for val in values])}\n' if values \
                else f'\t{day}: closed\n'
        print(result)


class IceCreamParlor(Restaurant):
    def __init__(self, name):
        super().__init__(name, "Ice Cream")
        self.flavors = []

    def add_flavors(self, *flavors):
        for f in flavors:
            if f not in self.flavors:
                self.flavors.append(f)
            else:
                print(f'\t{f} ice cream is on the menu already')

    def remove_flavors(self, *flavors):
        for f in flavors:
            if f in self.flavors:
                self.flavors.remove(f)
                print(f'\t{f} ice cream removed')
            else:
                print(f'\t{f} ice cream isn\'t on the menu')

    def show_flavors(self):
        if self.flavors:
            result = ', '.join([f for f in self.flavors])
            print(f'\n\tice cream flavors: {result}')
        else:
            print('\n\tno flavors')


if __name__ == '__main__':
    r1 = Restaurant('STÓŁ na Szewdzkiej', 'General')
    r2 = Restaurant('Whiskey in the Jar', 'American', 101)
    r3 = Restaurant('Vinyl Cafe', 'Cafe')
    l1 = IceCreamParlor("Przełam Lody")
    print('''
    \tRestaurants' data manipulation.
    \tEnter '0' for help.
    ''')
    while True:
        try:
            command = int(input('> '))
        except ValueError:
            print('Enter a valid integer value, please.')
            continue
        if command == 0:
            print('''
            Command\tDesc
            '0'\t\thelp
            '-1'\tquit
            '-2'\trestaurant's description
            '-3'\tshow opening hours
            '-4'\tadd new customers
            '-5'\tset customers
            '-6'\tadd flavors
            '-7'\tremove flavors
            '-8'\tshow flavors
            '-9'\tavailable restaurants
            ''')
        elif command == -1:
            print('See you soon!')
            break
        elif command == -2:
            while True:
                try:
                    name = str(input('Restaurant > '))
                except ValueError:
                    print('Enter a valid string value, please.')
                    break
                if name.lower() == 'stół na szwedzkiej':
                    r1.show_description()
                    break
                elif name.lower() == 'whiskey in the jar':
                    r2.show_description()
                    break
                elif name.lower() == "vinyl cafe":
                    r3.show_description()
                    break
                elif name.lower() == "przełam lody":
                    l1.show_description()
                    break
                else:
                    print('Enter correct name, please.')
                    continue
        elif command == -3:
            while True:
                try:
                    name = str(input('Restaurant > '))
                except ValueError:
                    print('Enter a valid string value, please.')
                    continue
                if name.lower() == 'stół na szwedzkiej':
                    r1.print_opening_hours()
                    break
                elif name.lower() == 'whiskey in the jar':
                    r2.print_opening_hours()
                    break
                elif name.lower() == "vinyl cafe":
                    r3.print_opening_hours()
                    break
                elif name.lower() == "przełam lody":
                    l1.print_opening_hours()
                    break
                else:
                    print('Enter correct name, please.')
                    continue
        elif command == -4:
            while True:
                try:
                    name = str(input('Restaurant > '))
                except ValueError:
                    print('Enter a valid string value, please.')
                    continue
                if name.lower() == 'stół na szwedzkiej':
                    r1.add_customers(100)
                    break
                elif name.lower() == 'whiskey in the jar':
                    r2.add_customers(100)
                    break
                elif name.lower() == "vinyl cafe":
                    r3.add_customers(100)
                    break
                elif name.lower() == "przełam lody":
                    l1.add_customers(100)
                    break
                else:
                    print('Enter correct name, please.')
                    continue
        elif command == -5:
            while True:
                try:
                    name = str(input('Restaurant > '))
                except ValueError:
                    print('Enter a valid string value, please.')
                    continue
                if name.lower() == 'stół na szwedzkiej':
                    r1.set_customers(250)
                    break
                elif name.lower() == 'whiskey in the jar':
                    r2.set_customers(250)
                    break
                elif name.lower() == "vinyl cafe":
                    r3.set_customers(250)
                    break
                elif name.lower() == "przełam lody":
                    l1.set_customers(250)
                    break
                else:
                    print('Enter correct name, please.')
                    continue
        elif command == -6:
            while True:
                try:
                    name = str(input('Restaurant > '))
                except ValueError:
                    print('Enter a valid string value, please.')
                    continue
                if name.lower() == "przełam lody":
                    l1.add_flavors('chocolate', 'vanilla', 'strawberry')
                    break
                else:
                    print('Enter correct name, please.')
                    continue
        elif command == -7:
            while True:
                try:
                    name = str(input('Restaurant > '))
                except ValueError:
                    print('Enter a valid string value, please.')
                    continue
                if name.lower() == "przełam lody":
                    l1.remove_flavors('vanilla', 'chocolate')
                    break
                else:
                    print('Enter correct name, please.')
                    continue
        elif command == -8:
            while True:
                try:
                    name = str(input('Restaurant > '))
                except ValueError:
                    print('Enter a valid string value, please.')
                    continue
                if name.lower() == "przełam lody":
                    l1.show_flavors()
                    break
                else:
                    print('Enter correct name, please.')
                    continue
        elif command == -9:
            r1.show_description()
            r2.show_description()
            r3.show_description()
            l1.show_description()
        else:
            print('Enter correct command, please.')
            continue


# 2
# import re
# from hashlib import md5
#
#
# class User:
#     def __init__(self, username, f_name, l_name, email, pwd):
#         self.username = username
#         _pattern = r"^[\w*-\.]*@([\w*-\.]*)[\.]([\w]{2,4})$"
#         if not re.match(_pattern, email):
#             print('incorrect email address')
#         self.email = email
#         self.f_name = f_name
#         self.l_name = l_name
#         self.__pwd = md5(pwd.encode()).hexdigest()
#         self.login_trials = 0
#
#     def show_desc(self):
#         print(f'''
#         Username: {self.username}
#         Email: {self.email}
#         Name: {self.f_name.title()} {self.l_name.title()}
#         Login trials: {self.login_trials}
#         {"You're an admin." if isinstance(self, Admin) else ""}''')
#
#     def shout_out(self):
#         print(f'\n\tLadies and gentlemen, let\'s give a shout out to {self.f_name.title()} {self.l_name.title()}!')
#
#     def add_login_trials(self, num):
#         try:
#             if num >= 0 and isinstance(num, int):
#                 self.login_trials += num
#             else:
#                 print('incorrect number of trials')
#         except TypeError:
#             print('incorrect number of trials')
#
#     def reset_login_trials(self):
#         self.login_trials = 0
#
#     def login(self, pwd):
#         self.login_trials += 1
#         print('Logged in' if md5(pwd.encode()).hexdigest() == self.__pwd else 'incorrect password')
#
#
# class Admin(User):
#     def __init__(self, username, f_name, l_name, email, pwd):
#         super().__init__(username, f_name, l_name, email, pwd)
#         self.privileges = ['block a user', 'unblock a user', 'add a post', 'remove a post']
#
#     def show_privileges(self):
#         # print(f"\n\tPrivileges: {', '.join([p for p in self.privileges])}")
#         print(Privileges.show_privileges(self))
#
#
# class Privileges:
#     def __init__(self, user):
#         self.privileges = user.privileges
#
#     def show_privileges(self):
#         print(f"\n\tPrivileges: {', '.join([p for p in self.privileges])}")
#
#
# if __name__ == '__main__':
#     u1 = User('garnilas', 'Paweł', 'Brodek', 'pawel.brodek@gmail.com', 'basicPassword123')
#     u2 = User('chillwave', 'Anita', 'Kowalska', 'anita.kowalska@gmail.com', 'harderPassword890')
#     a1 = Admin('milkyway', 'Zygmunt', 'Solorz', 'zygmunt.solorz@gmail.com', '00warlock77')
#     print('''
#     \tUsers' data manipulation.
#     \tEnter '0' for help.
#     ''')
#     while True:
#         try:
#             command = int(input('> '))
#         except ValueError:
#             print('Enter a valid integer value, please.')
#             continue
#         if command == 0:
#             print('''
#             Command\tDesc
#             '0'\t\thelp
#             '-1'\tquit
#             '-2'\tuser's description
#             '-3'\tshout out
#             '-4'\tadd login trials
#             '-5'\treset login trials
#             '-6'\tlogin
#             '-7'\tshow privileges
#             ''')
#         elif command == -1:
#             print('See you soon!')
#             break
#         elif command == -2:
#             while True:
#                 try:
#                     username = str(input('Username > '))
#                 except ValueError:
#                     print('Enter a valid string value, please.')
#                     break
#                 if username.lower() == 'garnilas':
#                     u1.show_desc()
#                     break
#                 elif username.lower() == 'chillwave':
#                     u2.show_desc()
#                     break
#                 elif username.lower() == "milkyway":
#                     a1.show_desc()
#                     break
#                 else:
#                     print('Enter correct username, please.')
#                     continue
#         elif command == -3:
#             while True:
#                 try:
#                     username = str(input('Username > '))
#                 except ValueError:
#                     print('Enter a valid string value, please.')
#                     continue
#                 if username.lower() == 'garnilas':
#                     u1.shout_out()
#                     break
#                 elif username.lower() == 'chillwave':
#                     u2.shout_out()
#                     break
#                 elif username.lower() == "milkyway":
#                     a1.shout_out()
#                     break
#                 else:
#                     print('Enter correct username, please.')
#                     continue
#         elif command == -4:
#             while True:
#                 try:
#                     username = str(input('Username > '))
#                 except ValueError:
#                     print('Enter a valid string value, please.')
#                     continue
#                 if username.lower() == 'garnilas':
#                     u1.add_login_trials(2)
#                     break
#                 elif username.lower() == 'chillwave':
#                     u2.add_login_trials(2)
#                     break
#                 elif username.lower() == "milkyway":
#                     a1.add_login_trials(2)
#                     break
#                 else:
#                     print('Enter correct username, please.')
#                     continue
#         elif command == -5:
#             while True:
#                 try:
#                     username = str(input('Username > '))
#                 except ValueError:
#                     print('Enter a valid string value, please.')
#                     continue
#                 if username.lower() == 'garnilas':
#                     u1.reset_login_trials()
#                     break
#                 elif username.lower() == 'chillwave':
#                     u2.reset_login_trials()
#                     break
#                 elif username.lower() == "milkyway":
#                     a1.reset_login_trials()
#                     break
#                 else:
#                     print('Enter correct username, please.')
#                     continue
#         elif command == -6:
#             while True:
#                 try:
#                     username = str(input('Username > '))
#                 except ValueError:
#                     print('Enter a valid string value, please.')
#                     continue
#                 if username.lower() == 'garnilas':
#                     u1.login('hmmm...')
#                     break
#                 elif username.lower() == 'chillwave':
#                     u2.login('harderPassword890')
#                     break
#                 elif username.lower() == "milkyway":
#                     a1.login('00warlock77')
#                     break
#                 else:
#                     print('Enter correct username, please.')
#                     continue
#         elif command == -7:
#             while True:
#                 try:
#                     username = str(input('Username > '))
#                 except ValueError:
#                     print('Enter a valid string value, please.')
#                     continue
#                 if username.lower() == "milkyway":
#                     a1.show_privileges()
#                     break
#                 else:
#                     print('Enter correct username, please.')
#                     continue
#         else:
#             print('Enter correct command, please.')
#             continue
