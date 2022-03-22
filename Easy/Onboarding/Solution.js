while (true) { // Game loop
    const enemy1 = readline(); // Name of enemy 1
    const dist1 = parseInt(readline()); // Distance to enemy 1
    const enemy2 = readline(); // Name of enemy 2
    const dist2 = parseInt(readline()); // Distance to enemy 2

    if (dist1 < dist2) { // If the enemy 1 is closer, shoot it
        print(enemy1);
    } else { // If the enemy 2 is closer, shoot it
        print(enemy2);
    }
}