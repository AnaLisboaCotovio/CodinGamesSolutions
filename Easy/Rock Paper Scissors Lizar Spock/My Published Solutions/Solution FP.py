# Which symbols win against which - first winner and second loser
pattern = ["CP", "CL", "PR", "PS", "RL", "RC", "LS", "LP", "SC", "SR"] 

def Duel (num1, sign1, num2, sign2): 
    if(sign1 + sign2 in pattern): 
        return True 
    elif (sign2 + sign1 in pattern): 
        return False 
    elif (num1 < num2):
        return True
    else:
        return False 

n = int(input()) # The number of players

winnersNum = [] 
winnersSign = [] 
losers = [] 
lostTo = [] 

for i in range(n): 
    inputs = input().split()
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

print(winnersNum[0])

lostToWinner = "" 
for i in range(len(losers)): 
    if(lostTo[i] == winnersNum[0]):
        lostToWinner += str(losers[i]) + " " 

print(lostToWinner[:-1])