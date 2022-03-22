while 1: # Game loop

    # VARIABLES
    enemy_1 = input()  # Name of enemy 1
    enemy_2 = input()  # nName of enemy 2
    dist_1 = int(input())  # Distance to enemy 1
    dist_2 = int(input())  # Distance to enemy 2

    if dist_1 < dist_2: # If the enemy 1 is closer, shoot it
        print(enemy_1)
    else: # If the enemy 2 is closer, shoot it
        print(enemy_2)