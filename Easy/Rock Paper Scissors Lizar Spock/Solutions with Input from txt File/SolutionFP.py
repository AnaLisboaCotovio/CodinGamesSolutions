# Which symbols win against which - first winner and second loser
pattern = ["CP", "CL", "PR", "PS", "RL", "RC", "LS", "LP", "SC", "SR"] 

with open("Test Sets/test1.txt")  as file: # Paste Source path of the txt file of the input
    lines = file.readlines()
line = [x[:-1] for x in lines[:-1]]
line.append(lines[-1])

def Duel (num1, sign1, num2, sign2): 
    if(sign1 + sign2 in pattern): 
        return True 
    elif (sign2 + sign1 in pattern): 
        return False 
    elif (num1 < num2):
        return True
    else:
        return False 

n = int(line[0]) # The number of players

winnersNum = [] 
winnersSign = [] 
losers = [] 
lostTo = [] 

for i in range(n): 
    inputs = line[1+i].split()
    np = int(inputs[0])
    sp = inputs[1]
    winnersNum.append(np)
    winnersSign.append(sp)

while len(winnersNum) > 1:
    num1 = winnersNum.pop(0) 
    num2 = winnersNum.pop(0) 

    sign1 = winnersSign.pop(0) 
    sign2 = winnersSign.pop(0) 

    d = Duel(num1, sign1, num2, sign2) # TRUE - first player wins and FALSE - second player wins

    if(d == True): 
        losers.append(num2) 
        lostTo.append(num1)

        winnersNum.append(num1) 
        winnersSign.append(sign1) 
        
    else:
        losers.append(num1) 
        lostTo.append(num2) 

        winnersNum.append(num2) 
        winnersSign.append(sign2) 

print()
print("The winner was Player: ", winnersNum[0])

lostToWinner = "" 
for i in range(len(losers)): 
    if(lostTo[i] == winnersNum[0]):
        lostToWinner += str(losers[i]) + " " 

print("This Player went up against the following players: ", lostToWinner[:-1])
print()