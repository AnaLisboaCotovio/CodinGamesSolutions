// Which symbols win against which - first winner and second loser
const pattern = ["CP", "CL", "PR", "PS", "RL", "RC", "LS", "LP", "SC", "SR"] 

const n = parseInt(readline()); // The number of players

var winnersNum = []; 
var winnersSign = []; 
var losers = []; 
var lostTo = []; 

for (let i = 0; i < n; i++) { 
    var inputs = readline().split(' ');
    winnersNum.push(parseInt(inputs[0]));
    winnersSign.push(inputs[1]);
}

while (winnersNum.length > 1){ 
    let num1 = winnersNum.shift();
    let num2 = winnersNum.shift(); 

    let sign1 = winnersSign.shift();
    let sign2 = winnersSign.shift(); 

    let res = Duel(num1, sign1, num2, sign2); // TRUE - first player wins and FALSE - second player wins

    if(res == true){ 
        losers.push(num2); 
        lostTo.push(num1); 

        winnersNum.push(num1); 
        winnersSign.push(sign1); 
    } else { 
        losers.push(num1); 
        lostTo.push(num2); 

        winnersNum.push(num2); 
        winnersSign.push(sign2); 
    }
}

function Duel(num1, sign1, num2, sign2){
    if(pattern.includes(sign1 + sign2)){ 
        return true; 
    } else if(pattern.includes(sign2 + sign1)){ 
        return false; 
    } else if(num1 < num2){ 
        return true; 
    } else 
        return false; 
}

let winner = winnersNum.shift(); 
console.log(winner); 

var enemies = ""; 
for(let i = 0; i < n-1; i++){ 
    if(lostTo[i] == winner){ 
        enemies += losers[i].toString() + " "; 
    }
}

console.log(enemies.slice(0, -1)); 
