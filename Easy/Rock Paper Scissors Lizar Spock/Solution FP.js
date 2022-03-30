const pattern = ["CP", "CL", "PR", "PS", "RL", "RC", "LS", "LP", "SC", "SR"] // Which symbols win against which - first winner and second loser

const n = parseInt(readline()); // The number of players

var winnersNum = []; // A queue initialized with all the players numbers in the order as they are given
var winnersSign = []; // A queue initialized with all the players signs in the order as they are given
var losers = []; // A list initialized without values that will have the losers' numbers added
var lostTo = []; // A list initialized without values that will have to whom the loser's lost to added

for (let i = 0; i < n; i++) { // Add all players numbers and signs to the respective queues
    var inputs = readline().split(' ');
    winnersNum.push(parseInt(inputs[0]));
    winnersSign.push(inputs[1]);
}

// When comparing 2 players in a Duel:
while (winnersNum.length > 1){ // Loop while there are more than 1 player in the queue of the players numbers
    let num1 = winnersNum.shift(); // Number of the first player - Remove the index 1 number of the queue and assign it to be used later
    let num2 = winnersNum.shift(); // Number of the second player - Remove the new index 1 number of the queue and assign it to be used later

    let sign1 = winnersSign.shift(); // Sign of the first player - Remove the index 1 sign of the queue and assign it to be used later
    let sign2 = winnersSign.shift(); // Sign of the second player - Remove the new index 1 sign of the queue and assign it to be used later

    let res = Duel(num1, sign1, num2, sign2); // Call the method Duel on the 2 players and return TRUE if the first player wins and FALSE if the second one wins

    if(res == true){ // If the first player wins
        losers.push(num2); // Add the number of the second player to the list of losers
        lostTo.push(num1); // Add the number of the first player to the list of lost to

        winnersNum.push(num1); // Add back to the end of the queue the number of the first player
        winnersSign.push(sign1); // Add back to the end of the queue the sign of the first player
    } else { // If the second player wins
        losers.push(num1); // Add the number of the first player to the list of losers
        lostTo.push(num2); // Add the number of the second player to the list of lost to

        winnersNum.push(num2); // Add back to the end of the queue the number of the second player
        winnersSign.push(sign2); // Add back to the end of the queue the sign of the second player
    }
}

// Method that will compare 2 players in a Duel
function Duel(num1, sign1, num2, sign2){
    if(pattern.includes(sign1 + sign2)){ // If the pattern has the sign of the first player and the sign of the second player in this order
        return true; // The first player wins
    } else if(pattern.includes(sign2 + sign1)){ // If the pattern has the sign of the second player and the sign of the first player in this order
        return false; // The second player wins

    // If the pattern doesn't have the signs of both players together, this means the sign is the same
    } else if(num1 < num2){ // If the number of the first player is smaller than the second one (as requested in the rules)
        return true; // The first player wins
    } else // If the number of the second player is smaller than the first one (as requested in the rules)
        return false; // The second player wins
}

let winner = winnersNum.shift(); // Remove the winner's number from the queue of numbers and assign it to a variable
console.log(winner); // Print the number of the winner

var enemies = ""; // It will take the list of enemies that lost to the winner as a string
for(let i = 0; i < n-1; i++){ // Loop over the loser's list
    if(lostTo[i] == winner){ // If the player lost to the winner
        enemies += losers[i].toString() + " "; // Add the number of the loser to the enemies string
    }
}

console.log(enemies.slice(0, -1)); // Print the string of enemies of the winner removing the last space
