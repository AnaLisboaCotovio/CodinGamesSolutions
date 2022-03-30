var inputs = readline().split(' ');
const lightX = parseInt(inputs[0]); // The X position of the light of power
const lightY = parseInt(inputs[1]); // The Y position of the light of power
let thorX = parseInt(inputs[2]); // Thor's starting X position
let thorY = parseInt(inputs[3]); // Thor's starting Y position

while (true) {
    let direction = ""; // Direction in which thor will move in each turn

    // Compare Thor's coordinates with the light of power's
    // Give a direction for thor to move
    // Change Thor's coordinates accordingly
    if(lightX > thorX && lightY < thorY){
        direction = "NE";
        thorX++;
        thorY--;
    }else{
        if(lightX < thorX && lightY < thorY){
            direction = "NW";
            thorX--;
            thorY--;
        }else{
            if(lightX < thorX && lightY > thorY){
                direction = "SW";
                thorX--;
                thorY++;
            }else{
                if(lightX > thorX && lightY > thorY){
                    direction = "SE";
                    thorX++;
                    thorY++;
                }else{
                    if(lightX > thorX){
                        direction = "E";
                        thorX++;
                    }else{
                        if(lightX < thorX){
                            direction = "W";
                            thorX--;
                        }
                    }

                    if(lightY > thorY){
                        direction = "S";
                        thorY++;
                    }else{
                        if(lightY < thorY){
                           direction = "N";
                            thorY--; 
                        }
                    }
                }
            }
        }
    }

    console.log(direction); // Output the direction in which Thor will move this turn
}
