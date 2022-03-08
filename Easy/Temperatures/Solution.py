import sys
import math

# VARIABLES
n = int(input())  # The number of temperatures to analyse
closest = float('inf')  # Bigger number than all others so that is can be shortened
signt = None # Will store TRUE if positive and FALSE if negative

if n <= 0 :
    closest = 0

for i in input().split() :
    t = int(i) 

    if (t > 0) : signt = True
    else: signt = False

    if (abs(t) < abs(closest)) : # If the positive value of the number is  smaller the closest one
        closest = t
    elif (t == abs(closest) and signt == True) : # If the positive value of the number is the same as the closest one and the t is positive
        closest = t
    elif (t == closest and signt == False) : # If the value of the number is the same as the closest one and the t is negative
        closest = t


print(closest)