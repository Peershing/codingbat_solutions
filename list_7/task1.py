# (author, index): (Jakub Łukaszewski, 266485)

# 1
import custom


module = __import__('custom')
# from custom import *
# import custom as user
# from custom import Admin

if __name__ == '__main__':
    admin1 = custom.Admin('freako', 'Tom', 'Brady', 'tom.brady@gmail.com', 'nflPlayer')
    admin2 = module.Admin('berty', 'Joe', 'Biden', 'joe.biden@gmail.com', 'thePresident')
    # admin1 = user.Admin('water', 'Przemyslaw', 'Czarnek', 'czarnek@gmail.com', 'eduMinister')
    # admin1 = Admin('wood', 'Łukasz', 'Mejza', 'mejza@gmail.com', 'sportMinister')
    admin1.show_desc()
    admin1.show_privileges()
    
    admin2.show_desc()
    admin2.show_privileges()
