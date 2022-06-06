"""
    Make a two-player Rock-Paper-Scissors game.
    Remember the rules:
        Rock beats scissors
        Scissors beats paper
        Paper beats rock
"""
user1 = input("user1 Enter your option 'rock, paper or scissors':").lower()
user2 = input("user2 Enter your option 'rock, paper or scissors':").lower()
if user1 == user2:
    print("It is a tie")
elif user1 =='rock':
    if user2 == 'scissors':
        print("user1 with rock wins")
    else : 
        print("user2 with scissors wins")  
elif user1 == 'scissor':
    if user2 == 'paper':
        print("user1 with scissors wins")
    else:
        print('user2 with rock wins')
elif user1 == 'paper':
    if user2 == 'rock':
        print('user1 with paper wins')
    else:
        print('user 2 with scissors wins')
else :
    print('invalid entry')                
        