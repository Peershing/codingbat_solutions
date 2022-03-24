from random import randrange

secret_int = randrange(1, 11)
guess_count = 0
print('Guess an integer in the 1-10 range.')
while True:
    if guess_count < 3:
        guess = int(input('Guess: '))
        guess_count += 1
        if guess != secret_int:
            print('Miss!')
        else:
            print("You won!")
            break
    else:
        print('You lost.')
        break
