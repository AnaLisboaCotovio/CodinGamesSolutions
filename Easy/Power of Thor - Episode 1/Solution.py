import sys
import math

light_x, light_y, initial_tx, initial_ty = [int(i) for i in input().split()]

# VARIABLES
thorX = initial_tx # Thor's current X position
thorY = initial_ty # Thor's current Y position
direction = "" # The direction Thor will be taking this turn

while True: # game loop
    remaining_turns = int(input())  # The remaining amount of turns Thor can move.

    if light_x > thorX and light_y < thorY:
        direction = "NE"
        thorX += 1
        thorY -= 1
    elif light_x < thorX and light_y < thorY:
        direction = "NW"
        thorX -= 1
        thorY -= 1
    elif light_x < thorX and light_y > thorY:
        direction = "SW"
        thorX -= 1
        thorY += 1
    elif light_x > thorX and light_y > thorY:
        direction = "SE"
        thorX += 1
        thorY += 1
    else:
        if light_x > thorX:
            direction = "E"
            thorX += 1
        elif light_x < thorX:
            direction = "W"
            thorX -= 1
        
        if light_y > thorY:
            direction = "S"
            thorY += 1
        elif light_y < thorY:
            direction = "N"
            thorY -= 1


    print(direction) # the final direction Thor takes this turn