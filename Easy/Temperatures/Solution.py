n = int(input())  # The number of temperatures to analyse
closest = float('inf')
signt = None # TRUE if temperature positive and FALSE if temperature negative

if n <= 0 : 
    closest = 0 

for i in input().split() : 
    t = int(i) # The temperatures

    if (t > 0) : signt = True 
    else: signt = False

    if (abs(t) < abs(closest)) : 
        closest = t
    elif (t == abs(closest) and signt == True) :
        closest = t

print(closest)
