const n = parseInt(readline()); // The number of temperatures to analyse
var inputs = readline().split(' ');
let closest = Number.MAX_SAFE_INTEGER + 1; // The closest value to 0 initialized as the max value so it can be shortened 
let signt; // Will store TRUE if positive and FALSE if negative

if (n <= 0){ // If there are no temperatures
    closest = 0 // Set 0 as the closest temperature (requested in the rules)
}

for (let i = 0; i < n; i++){ // For all the temperatures
    const t = parseInt(inputs[i]); // The temperature

    if(t > 0){ // Set the sign of that temperature
        signt = true
    } else{ 
        signt = false
    }

    // Set the closes value to the temperature in question in these 2 scenarios:
    if(Math.abs(t) < Math.abs(closest)){ // If the absolute value of the number is smaller than the absolute value of the closest one
        closest = t;
    } else {
        if(t == Math.abs(closest) && signt == true){ // If the absolute value of the number is the same as the absolute value of the closest one and it is positive
            closest = t;
        }
    }
}

console.log(closest); // Output the temperature that is closest to 0
