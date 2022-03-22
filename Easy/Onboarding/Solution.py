while 1: # game loop

    # VARIABLES
    enemy_1 = input()  # name of enemy 1
    enemy_2 = input()  # name of enemy 2
    dist_1 = int(input())  # distance to enemy 1
    dist_2 = int(input())  # distance to enemy 2

    if dist_1 < dist_2: # if the enemy 1 is closer, shoot it
        print(enemy_1)
    else: # if the enemy 2 is closer, shoot it
        print(enemy_2)