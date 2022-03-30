pattern = ["CP", "CL", "PR", "PS", "RL", "RC", "LS", "LP", "SC", "SR"] # Which symbols win against which - first winner and second loser

# Method that will compare 2 players in a Duel
def Duel (num1, sign1, num2, sign2): 
    if(sign1 + sign2 in pattern): # If the pattern has the sign of the first player and the sign of the second player in this order
        return True # The first player wins
    elif (sign2 + sign1 in pattern): # If the pattern has the sign of the second player and the sign of the first player in this order
        return False # The second player wins

    # If the pattern doesn't have the signs of both players together, this means the sign is the same
    elif (num1 < num2): # If the number of the first player is smaller than the second one (as requested in the rules)
        return True # The first player wins
    else: # If the number of the second player is smaller than the first one (as requested in the rules)
        return False # The second player wins

n = int(input()) # The number of players

winnersNum = [] # A queue initialized with all the players numbers in the order as they are given
winnersSign = [] # A queue initialized with all the players signs in the order as they are given
losers = [] # A list initialized without values that will have the losers' numbers added
lostTo = [] # A list initialized without values that will have to whom the loser's lost to added

for i in range(n): # Add all players numbers and signs to the respective queues
    inputs = input().split()
    np = int(inputs[0])
    sp = inputs[1]
    winnersNum.append(np)
    winnersSign.append(sp)

# When comparing 2 players in a Duel:
while len(winnersNum) > 1: # Loop while there are more than 1 player in the queue of the players numbers
    num1 = winnersNum.pop(0) # Number of the first player - Remove the index 1 number of the queue and assign it to be used later
    num2 = winnersNum.pop(0) # Number of the second player - Remove the new index 1 number of the queue and assign it to be used later

    sign1 = winnersSign.pop(0) # Sign of the first player - Remove the index 1 sign of the queue and assign it to be used later
    sign2 = winnersSign.pop(0) # Sign of the second player - Remove the new index 1 sign of the queue and assign it to be used later

    d = Duel(num1, sign1, num2, sign2) # Call the method Duel on the 2 players and return TRUE if the first player wins and FALSE if the second one wins

    if(d == True): # If the first player wins
        losers.append(num2) # Add the number of the second player to the list of losers
        lostTo.append(num1) # Add the number of the first player to the list of lost to

        winnersNum.append(num1) # Add back to the end of the queue the number of the first player
        winnersSign.append(sign1) # Add back to the end of the queue the sign of the first player
        
    else: # If the second player wins
        losers.append(num1) # Add the number of the first player to the list of losers
        lostTo.append(num2) # Add the number of the second player to the list of lost to

        winnersNum.append(num2) # Add back to the end of the queue the number of the second player
        winnersSign.append(sign2) # Add back to the end of the queue the sign of the second player

print(winnersNum[0]) # Print the number of the winner

lostToWinner = "" # It will take the list of enemies that lost to the winner as a string
for i in range(len(losers)): # Loop over the loser's list
    if(lostTo[i] == winnersNum[0]): # If the player lost to the winner
        lostToWinner += str(losers[i]) + " " # Add the number of the loser to the enemies string

print(lostToWinner[:-1]) # Print the string of enemies of the winner removing the last space
