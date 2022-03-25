# (author, index): (Jakub Łukaszewski, 266485)

# 1
from math import log, e


class LogExp:
    """Class defining exponential and logarithmic functions"""

    def __init__(self, a):
        """ 'A' passed through constructor """
        self.a = a

    def log_a(self, x):
        """Base a logarithm of x"""
        try:
            return log(x) / log(self.a) if self.a > 0 and self.a != 1 else None
        except (TypeError, ValueError):
            return None

    def exp_a(self, x):
        """ Exponential function"""
        try:
            return self.a ** x if self.a > 0 and self.a != 1 else None
        except (TypeError, ValueError):
            return None


if __name__ == "__main__":
    b1 = LogExp(e)
    log_b1 = b1.log_a(10)  # e base logarithm of e
    exp_b1 = b1.exp_a(-4)  # exponential function e^x, where x = -4
    print(f'''
    - Results -
    log_e(10) = {log_b1}
    e^(-4) = {exp_b1}
    e^0 = {b1.exp_a(0)}
    ''')

# 2
# class Rectangle:
#     """ Calculates area of the rectangle given sides length """
#
#     def __init__(self, x, y=0):
#         self.x = x
#         self.y = y
#
#     def area(self):
#         return self.x * self.y
#
#
# class Square (Rectangle):
#     """ Calculates area of the square given side length"""
#
#     def __init__(self, x):
#         Rectangle.__init__(self, x)
#         self.y = self.x
#
#
# if __name__ == "__main__":
#     a_side = 101;
#     b_side = 12;
#
#     print(f'''
#     * * * * *
#     Rectangle ({a_side}m x {b_side})m): {'{:,.2f} m²'.format(Rectangle(a_side, b_side).area())}
#     Square ({a_side}m): {'{:,.2f} m²'.format(Square(a_side).area())}
#     * * * * *
#     ''')

# 3
# class Info:
#     """ Student's grades information """
#
#     def __init__(self, name, last_name, index):
#         if not str(index).isdecimal() or len(index) != 6:
#             print("wrong index ...")
#             # exit(1)
#         else:
#             self.name = name
#             self.last_name = last_name
#             self.index = index
#             self.grades = {
#                 "WP": 0,
#                 "Matematyka dyskretna": 0,
#                 "Analiza": 0
#             }
#
#
# class Student(Info):
#     def __init__(self, name, last_name, index):
#         super().__init__(name, last_name, index)
#
#     def display_data(self):
#         grading = "\n".join([f"\t{subject}: {grade}" for subject, grade in self.grades.items()])
#         print(f"Student of index {self.index}:\nName: {self.name}\n"
#               f"Last name: {self.last_name}\nStudent's grades:\n{grading}")
#
#     def display_grades(self):
#         grading = "\n".join([f"\t{subject}: {grade}" for subject, grade in self.grades.items()])
#         print(f"Student's grades of {self.index}:\n{grading}")
#
#     def add_grades(self, subject, grade):
#         try:
#             if not self.grades[subject]:
#                 self.grades[subject] = grade
#                 print(
#                     f"New grade added {self.grades[subject]} from {subject} "
#                     f"for a student of index {self.index}")
#             else:
#                 print(f"Grade from {subject} "
#                       f"for a student of index {self.index} already exists")
#         except KeyError:
#             print(f"Wrong subject: {subject} while adding a grade.")
#
#     def change_grades(self, subject, grade):
#         try:
#             if self.grades[subject]:
#                 old_one = self.grades[subject]
#                 self.grades[subject] = grade
#                 print(f"Grade {old_one} from {subject} has been changed to {self.grades[subject]}")
#             else:
#                 print(f"Before changing a grade from {subject} for the student of index {self.index}, you've to add it.")
#         except KeyError:
#             print(f"Wrong subject: {subject} while trying to change a grade.")
#
#
# if __name__ == "__main__":
#     student1 = Student("Krzysztof", "Borek", "275560")
#     student2 = Student("Anita", "Mielczykowska", "203421")
#     student3 = Student("Bartek", "Społek", "234850")
#     print('* * * * *\n')
#     Student.display_grades(student1)
#     print('* * * * *\n')
#     Student.change_grades(student1, "WP", 4.5)
#     print('* * * * *\n')
#     Student.add_grades(student1, "WP", 3.0)
#     Student.add_grades(student1, "Matematyka dyskretna", 3.5)
#     Student.add_grades(student1, "Analiza", 5.5)
#     Student.add_grades(student1, "Matematyka dyskretna", 4.5)
#     print('* * * * *\n')
#     Student.display_grades(student1)
#     print('* * * * *\n')
#     Student.change_grades(student1, "Analiza", 5.0)
#     print('* * * * *\n')
#     Student.display_grades(student1)
#     Student.display_grades(student2)
#     print('* * * * *\n')
#     Student.display_data(student1)
