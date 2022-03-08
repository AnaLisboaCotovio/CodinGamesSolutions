import sys
import math

while True: # game loop

    # VARIABLES
    max = 0 # This will be the height of the tallest mountain
    idmax = 0 # This will be the index of the tallest mountain

    for i in range(8): # Evaluation of all the maountains remaining in each turn
        mountain_h = int(input())  # represents the height of one mountain.

        if mountain_h > max: # Compare each mountain height with the height of the current max
            max = mountain_h # if the mountain is taller it becomes the new max
            idmax = i # and the id of that max mountain becomes the id of the max 
    
    print(idmax) # Code to fire upon the tallest mountain