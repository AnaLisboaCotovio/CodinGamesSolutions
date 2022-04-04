const n = parseInt(readline()); // The number of temperatures to analyse
var inputs = readline().split(' ');
let closest = Number.MAX_SAFE_INTEGER + 1; 
let signt; // TRUE if temperature positive and FALSE if temperature negative

if (n <= 0){ 
    closest = 0 
}

for (let i = 0; i < n; i++){ 
    const t = parseInt(inputs[i]); // The temperatures

    if(t > 0){ 
        signt = true
    } else{ 
        signt = false
    }

    if(Math.abs(t) < Math.abs(closest)){ 
        closest = t;
    } else {
        if(t == Math.abs(closest) && signt == true){ 
            closest = t;
        }
    }
}

console.log(closest);
