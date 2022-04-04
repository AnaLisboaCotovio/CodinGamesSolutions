// Which symbols win against which - first winner and second loser
const pattern = ["CP", "CL", "PR", "PS", "RL", "RC", "LS", "LP", "SC", "SR"]

class Player {
    // Constructor
    constructor(num, sign, ene){
        this.number = num;
        this.sign = sign;
        this.enemies = ene;
    }

    // Behaviours
    addEnemy(enemy){ 
        this.enemies.push(enemy.number)
    }

    enemiesString(){ 
        let s = this.enemies.join(" ");

        return s
    }
}

const n = parseInt(readline()); // The number of players
var competition = []; 

for (let i = 0; i < n; i++) {
    var inputs = readline().split(' ');
    const np = parseInt(inputs[0]);
    const sp = inputs[1];
    const ene = [];
    competition.push(new Player(np, sp, ene));
}

while(competition.length > 1) { 
    // Duel the first 2 player in the competition and add the winner to the end of the queue
    competition.push(duel(competition.shift(), competition.shift())); 
}

let  winner = competition.shift(); 
console.log(winner.number); 
console.log(winner.enemiesString()); 

function duel (p1, p2) {
    p1.addEnemy(p2)
    p2.addEnemy(p1)

    if(pattern.includes(p1.sign + p2.sign)){ 
        return p1; 
    } else if(pattern.includes(p2.sign + p1.sign)){ 
        return p2;
    } else if (p1.number < p2.number) { 
        return p1; 
    } else { 
        return p2; 
    }
}
