// VARIABLES
const n = parseInt(readline()); // The number of temperatures to analyse
var inputs = readline().split(' ');
let closest = Number.MAX_SAFE_INTEGER + 1; // Max value so it can be shortened 
let signt; // Will store TRUE if positive and FALSE if negative

if (n <= 0){
    closest = 0
}

for (let i = 0; i < n; i++){
    const t = parseInt(inputs[i]);

    if(t > 0){ signt = true}
    else { signt = false}

    if(Math.abs(t) < Math.abs(closest)){ // If the positive value of the number is  smaller the closest one
        closest = t;
    } else {
        if(t == Math.abs(closest) && signt == true){ // If the positive value of the number is the same as the closest one and the t is positive
            closest = t;
        } else {
            if(t == closest && signt == false){ // If the value of the number is the same as the closest one and the t is negative
                closest = t;
            }
        }
    }
}

console.log(closest);