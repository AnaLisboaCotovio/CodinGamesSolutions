while (true) { // game loop

    // VARIABLES
    let max = 0; // This will be the height of the tallest mountain
    let idmax = 0; // This will be the index of the tallest mountain 

    for (let i = 0; i < 8; i++) { // Evaluation of all the maountains remaining in each turn
        const mountainH = parseInt(readline()); // represents the height of one mountain.

        if(mountainH > max){ //Compare each mountain height with the height of the current max
            max = mountainH; // if the mountain is taller it becomes the new max
            idmax = i; //and the id of that max mountain becomes the id of the max 
        }
    }
    console.log(idmax); // Code to fire upon the tallest mountain 
}