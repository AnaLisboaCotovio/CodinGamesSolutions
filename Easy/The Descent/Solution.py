while True: 

    max = 0 
    idmax = 0 

    for i in range(8): 
        mountain_h = int(input()) # The height of each mountain

        if mountain_h > max:
            max = mountain_h 
            idmax = i
    
    print(idmax)
