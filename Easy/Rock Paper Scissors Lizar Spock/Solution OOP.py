pattern = ["CP", "CL", "PR", "PS", "RL", "RC", "LS", "LP", "SC", "SR"]

class Player:
    #int(math.log(amountPlayers, 2))

    enemies = ""

    # Constructor
    def __init__ (self, num, sign):
        self.number = num
        self.sign = sign
    
    def addEnemy(self, enemy):
        self.enemies += str(enemy.number) + " "

    def enemyString (self):
        return self.enemies[0:-1]

def Duel (p1, p2):
    Player.addEnemy(p1, p2)
    Player.addEnemy(p2, p1)

    if (p1.sign + p2.sign in pattern):
        return p1
    elif (p2.sign + p1.sign in pattern):
        return p2
    elif (p1.number < p2.number):
        return p1
    else:
        return p2

n = int(input())
competition = []

for i in range(n):
    inputs = input().split()
    np = int(inputs[0])
    sp = inputs[1]
    competition.append(Player(np, sp))

while len(competition) > 1:
    competition.append(Duel(competition.pop(0), competition.pop(0)))

winner = competition.pop(0)
print(winner.number)
print(Player.enemyString(winner))