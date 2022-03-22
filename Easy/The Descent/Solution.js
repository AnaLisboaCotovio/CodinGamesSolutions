while (true) { // Game loop - Loops everytime the ship changes direction
    let max = 0; // The max height of a mountain
    let idmax = 0; // The id of the mountain with the maximum height
    
    for (let i = 0; i < 8; i++) { // Looping within the 8 - the amount of mountains
        const mountainH = parseInt(readline()); // Represents the height of one mountain just given as input

        if(mountainH > max){ // If the input mountain's height is bigger than the maximum
            max = mountainH; // Substitute de maximum height for the input's height
            idmax = i; // And the id of the maximum height mountain for the id of the input's mountain
        }
    }
    console.log(idmax); // Destroy the tallest mountain
}
