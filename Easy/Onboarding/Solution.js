
while (true) { // game loop

    // VARIABLES
    const enemy1 = readline(); // name of enemy 1
    const enemy2 = readline(); // name of enemy 2
    const dist1 = parseInt(readline()); // distance to enemy 1
    const dist2 = parseInt(readline()); // distance to enemy 2

    if (dist1 < dist2) { 
        print(enemy1);
    } else {
        print(enemy2);
    }
}