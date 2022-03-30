n = int(input())  # The number of temperatures to analyse
closest = float('inf')  # The closest value to 0 initialized as the max value so it can be shortened 
signt = None # Will store TRUE if positive and FALSE if negative

if n <= 0 : # If there are no temperatures
    closest = 0 # Set 0 as the closest temperature (requested in the rules)

for i in input().split() : # For all the temperatures
    t = int(i) # The temperature

    # Set the sign of that temperature
    if (t > 0) : signt = True 
    else: signt = False

    # Set the closes value to the temperature in question in these 2 scenarios:
    if (abs(t) < abs(closest)) : # If the absolute value of the number is smaller than the absolute value of the closest one
        closest = t
    elif (t == abs(closest) and signt == True) : # If the absolute value of the number is the same as the absolute value of the closest one and it is positive
        closest = t

print(closest) # Output the temperature that is closest to 0
