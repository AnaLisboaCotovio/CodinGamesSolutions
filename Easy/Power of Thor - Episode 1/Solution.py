lightX, lightY, thorX, thorY = [int(i) for i in input().split()]

while True: 
    direction = "" 

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

    print(direction) 
