from Person import Person


class Barbarian(Person):
    def __init__(self, name, weapon):
        self.name = name
        self.weapon = weapon

    def attack(self):
        print(f'attacked with a {self.weapon}')
