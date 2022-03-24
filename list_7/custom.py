import re
from hashlib import md5


class User:
    def __init__(self, username, f_name, l_name, email, pwd):
        self.username = username
        _pattern = r"^[\w*-\.]*@([\w*-\.]*)[\.]([\w]{2,4})$"
        if not re.match(_pattern, email):
            print('incorrect email address')
        self.email = email
        self.f_name = f_name
        self.l_name = l_name
        self.__pwd = md5(pwd.encode()).hexdigest()
        self.login_trials = 0

    def show_desc(self):
        print(f'''
        Username: {self.username}
        Email: {self.email}
        Name: {self.f_name.title()} {self.l_name.title()}
        Login trials: {self.login_trials}
        {"You're an admin." if isinstance(self, Admin) else ""}''')

    def shout_out(self):
        print(f'\n\tLadies and gentlemen, let\'s give a shout out to {self.f_name.title()} {self.l_name.title()}!')

    def add_login_trials(self, num):
        try:
            if num >= 0 and isinstance(num, int):
                self.login_trials += num
            else:
                print('incorrect number of trials')
        except TypeError:
            print('incorrect number of trials')

    def reset_login_trials(self):
        self.login_trials = 0

    def login(self, pwd):
        self.login_trials += 1
        print('Logged in' if md5(pwd.encode()).hexdigest() == self.__pwd else 'incorrect password')


class Admin(User):
    def __init__(self, username, f_name, l_name, email, pwd):
        super().__init__(username, f_name, l_name, email, pwd)
        self.privileges = ['block a user', 'unblock a user', 'add a post', 'remove a post']

    def show_privileges(self):
        print(f"\n\tPrivileges: {', '.join([p for p in self.privileges])}")
        # print(Privileges.show_privileges(self))


class Privileges:
    def __init__(self, user):
        self.privileges = user.privileges

    def show_privileges(self):
        print(f"\n\tPrivileges: {', '.join([p for p in self.privileges])}")
