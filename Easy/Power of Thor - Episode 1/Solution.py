# lightX: The X position of the light of power
# lightY: The Y position of the light of power
# thorX: Thor's starting X position
# thorY: Thor's starting Y position
lightX, lightY, thorX, thorY = [int(i) for i in input().split()]

while True: # Game loop
    direction = "" # Direction in which thor will move in each turn

    # Compare Thor's coordinates with the light of power's
    # Give a direction for thor to move
    # Change Thor's coordinates accordingly
    if lightX > thorX and lightY < thorY:
        direction = "NE"
        thorX += 1
        thorY -= 1
    elif lightX < thorX and lightY < thorY:
        direction = "NW"
        thorX -= 1
        thorY -= 1
    elif lightX < thorX and lightY > thorY:
        direction = "SW"
        thorX -= 1
        thorY += 1
    elif lightX > thorX and lightY > thorY:
        direction = "SE"
        thorX += 1
        thorY += 1
    else:
        if lightX > thorX:
            direction = "E"
            thorX += 1
        elif lightX < thorX:
            direction = "W"
            thorX -= 1
        
        if lightY > thorY:
            direction = "S"
            thorY += 1
        elif lightY < thorY:
            direction = "N"
            thorY -= 1

    print(direction) # Output the direction in which Thor will move this turn
