pattern = ["CP", "CL", "PR", "PS", "RL", "RC", "LS", "LP", "SC", "SR"] # Which symbols win against which - first winner and second loser

class Player:

    # States
    enemies = ""

    # Constructor
    def __init__ (self, num, sign):
        self.number = num
        self.sign = sign
    
    # Behaviours
    def addEnemy(self, enemy): # Add enemies to the ArrayList of enemies
        self.enemies += str(enemy.number) + " "

    def enemyString (self): # Return the enemies' list as a string
        return self.enemies[0:-1]

def Duel (p1, p2):
    # Add each player to the other's enemies' list
    Player.addEnemy(p1, p2)
    Player.addEnemy(p2, p1)

    if (p1.sign + p2.sign in pattern): # If the pattern has the sign of the first player and the sign of the second player in this order
        return p1 # The first player wins
    elif (p2.sign + p1.sign in pattern): # If the pattern has the sign of the second player and the sign of the first player in this order
        return p2 # The second player wins
    elif (p1.number < p2.number): # If the number of the first player is smaller than the second one (as requested in the rules)
        return p1 # The first player wins
    else: # If the number of the second player is smaller than the first one (as requested in the rules)
        return p2 # The second player wins

n = int(input()) # The number of players
competition = [] # A queue of the tournament with all the Players - Loser's will be removed later

for i in range(n): # Add new player with each number and sign
    inputs = input().split()
    np = int(inputs[0])
    sp = inputs[1]
    competition.append(Player(np, sp))

while len(competition) > 1: # Loop while there is more than 1 player in the competition's queue
    competition.append(Duel(competition.pop(0), competition.pop(0))) # Have a duel between the first 2 player in the competition queue and add the winner to the end of the queue

winner = competition.pop(0) # Get the winner
print(winner.number) # Print the winner's number
print(Player.enemyString(winner)) # Print the winner's enemies' string
