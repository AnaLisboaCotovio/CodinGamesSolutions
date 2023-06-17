with open("Test Sets/test1.txt") as  file: # Paste Source path of the txt file of the input
    lines = file.readlines()
line = [x[:-1] for x in lines[:-1]]
line.append(lines[-1])

n = int(line[0])  # The number of temperatures to analyse
closest = float('inf')
signt = None # TRUE if temperature positive and FALSE if temperature negative

print()
print("From the  following temperatures: ", end = " ")

if int(line[0]) == 0 :
    print("0", end = " ")
    closest = 0
else:
    for i in line[1].split() : 
        t = int(i) # The temperatures
        print(t, end = "  ")

        if (t > 0) : signt = True 
        else: signt = False

        if (abs(t) < abs(closest)) : 
            closest = t
        elif (t == abs(closest) and signt == True) :
            closest = t

print()
print("The one that is closest to zero is: ", closest)
print()
