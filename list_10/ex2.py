# (author, index): (Jakub Łukaszewski, 266485)

import unittest
import random


class EmployeeTest(unittest.TestCase):
    def setUp(self) -> None:
        self.employee = Employee("Marek", "Bodziec", 89_550)

    def test_bad_raise_type(self):
        with self.assertRaises(TypeError):
            self.employee.give_raise(0.101)

    def test_bad_raise_val(self):
        with self.assertRaises(ValueError):
            self.employee.give_raise(-2_103)

    def test_random_raise(self):
        val = random.randint(2, 999)
        self.employee.give_raise(val)
        self.assertEqual(self.employee.annual_salary, 89_550 + val)

    def test_default_raise(self):
        self.employee.give_raise()
        self.assertEqual(self.employee.annual_salary, 91_550)


class Employee:
    def __init__(self, f_name: str, l_name: str, annual_salary: int) -> None:
        if not isinstance(annual_salary, int):
            raise TypeError("annual_salary:int not met")
        if not isinstance(f_name, str) or not isinstance(f_name, str):
            raise TypeError("name:str not met")
        self.f_name = f_name
        self.l_name = l_name
        self.annual_salary = annual_salary

    def __str__(self) -> str:
        return f'{self.f_name} {self.l_name} making {self.annual_salary}/year'

    def __repr__(self) -> str:
        return f'Employee[{self.f_name}, {self.l_name}]'

    def give_raise(self, val=2_000) -> None:
        if not isinstance(val, int):
            raise TypeError("raise:int not met")
        if val <= 0:
            raise ValueError("raise > 0 not met")
        self.annual_salary += val


if __name__ == '__main__':
    unittest.main()
