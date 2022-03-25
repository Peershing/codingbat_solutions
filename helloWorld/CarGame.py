is_car_started = False
print('Enter help (h) for help.')

while True:
    command = input('> ')

    if command.lower() == 'help' or command.lower() == 'h':
        print('''
    start - to start the car
    stop - to stop the car
    quit - to exit the game
        ''')
    elif command.lower() == 'start':
        if is_car_started:
            print("The car has already been started.")
        else:
            is_car_started = True
            print('The car started...')
    elif command.lower() == 'stop':
        if is_car_started:
            is_car_started = False
            print('The car stopped...')
        else:
            print("The car has already been stopped.")
    elif command.lower() == 'quit':
        break
    else:
        print("I don't understand that.")