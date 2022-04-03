while 1:
    enemy_1 = input()  # Name of enemy 1
    enemy_2 = input()  # nName of enemy 2
    dist_1 = int(input())  # Distance to enemy 1
    dist_2 = int(input())  # Distance to enemy 2

    if dist_1 < dist_2:
        print(enemy_1)
    else: 
        print(enemy_2)
