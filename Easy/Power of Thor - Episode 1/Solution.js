// VARIABLES
var inputs = readline().split(' ');
const lightX = parseInt(inputs[0]); // the X position of the light of power
const lightY = parseInt(inputs[1]); // the Y position of the light of power
const initialTx = parseInt(inputs[2]); // Thor's starting X position
const initialTy = parseInt(inputs[3]); // Thor's starting Y position
var thorX = initialTx; // Thor's current X position
var thorY = initialTy; // Thor's current Y position
let direçãoX = ""; // the direction thor will take in the X axis
let direçãoY = ""; // the direction thor will take in the Y axis
 
while (true) { // game loop
    const remainingTurns = parseInt(readline()); // The remaining amount of turns Thor can move.
 
    if(lightX > thorX){
        direçãoX = 'E';
        thorX++;
    } else{
        if(lightX < thorX){
            direçãoX = 'W';
            thorX--;
        }
    } 

    if(lightY > thorY){
        direçãoY = 'S';
        thorY++;
    } else{
        if(lightY < thorY){
            direçãoY = 'N';
            thorY--;
        }
    }
 
    console.log(direçãoY + direçãoX); // The final direction Thor is taking this turn
}