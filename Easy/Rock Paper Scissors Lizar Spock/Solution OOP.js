const pattern = ["CP", "CL", "PR", "PS", "RL", "RC", "LS", "LP", "SC", "SR"] // Which symbols win against which - first winner and second loser

class Player {
    // Constructor
    constructor(num, sign, ene){
        this.number = num;
        this.sign = sign;
        this.enemies = ene;
    }

    // Behaviours
    addEnemy(enemy){ // Add enemies to the ArrayList of enemies
        this.enemies.push(enemy.number)
    }

    enemiesString(){ // Return the enemies' list as a string
        let s = this.enemies.join(" ");

        return s
    }
}

const n = parseInt(readline()); // The number of players
var competition = []; // A queue of the tournament with all the Players - Loser's will be removed later

for (let i = 0; i < n; i++) { // Add new player with each number and sign and an empty array of enemies
    var inputs = readline().split(' ');
    const np = parseInt(inputs[0]);
    const sp = inputs[1];
    const ene = [];
    competition.push(new Player(np, sp, ene));
}

while(competition.length > 1) { // Loop while there is more than 1 player in the competition's queue
    competition.push(duel(competition.shift(), competition.shift())); // Have a duel between the first 2 player in the competition queue and add the winner to the end of the queue
}

let  winner = competition.shift(); // Get the winner
console.log(winner.number); // Print the winner's number
console.log(winner.enemiesString()); // Print the winner's enemies' string

function duel (p1, p2) {
    // Add each player to the other's enemies' list
    p1.addEnemy(p2)
    p2.addEnemy(p1)

    if(pattern.includes(p1.sign + p2.sign)){ // If the pattern has the sign of the first player and the sign of the second player in this order
        return p1; // The first player wins
    } else if(pattern.includes(p2.sign + p1.sign)){ // If the pattern has the sign of the second player and the sign of the first player in this order
        return p2; // The second player wins
    } else if (p1.number < p2.number) { // If the number of the first player is smaller than the second one (as requested in the rules)
        return p1; // The first player wins
    } else { // If the number of the second player is smaller than the first one (as requested in the rules)
        return p2; // The second player wins
    }
}
