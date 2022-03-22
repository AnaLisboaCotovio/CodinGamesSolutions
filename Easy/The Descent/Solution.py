while True: # Game loop - Loops everytime the ship changes direction

    max = 0 # The max height of a mountain
    idmax = 0 # The id of the mountain with the maximum height

    for i in range(8): # Looping within the 8 - the amount of mountains
        mountain_h = int(input()) # Represents the height of one mountain just given as input

        if mountain_h > max: # If the input mountain's height is bigger than the maximum
            max = mountain_h # Substitute de maximum height for the input's height
            idmax = i # And the id of the maximum height mountain for the id of the input's mountain
    
    print(idmax) # Destroy the tallest mountain
