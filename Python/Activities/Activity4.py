while True:
    player1Choice = input("Please enter your choice from rock,paper and scissors: ").lower()
    player2Choice = input("Please enter your choice from rock,paper and scissors: ").lower()
    if player1Choice == player2Choice:
        print("It's a tie")
    elif player1Choice == "rock":
        if player2Choice == "scissors":
            print("Rock Wins")
        else:
            print("Paper wins")
    elif player1Choice == "scissors":
        if player2Choice == "paper":
            print("scissors Wins")
        else:
            print("Rock wins")
    elif player1Choice == "paper":
        if player2Choice == "rock":
            print("paper Wins")
        else:
            print("scissors wins")
    else:
        print("invalid input. Please try giving you choice from rock,paper and scissor")

    repeat = input("Do you want to continue Yes/No : ").lower()

    if repeat == "yes":
        pass
    elif repeat == "no":
        # print("test")
        break
    else:
        print("You entered invalid option, existing now .")
        break
