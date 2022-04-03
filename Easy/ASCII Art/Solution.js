const alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // A string that contains all the letters of the alphabet in english

const l = parseInt(readline()); // The length of each letter
const h = parseInt(readline()); // The height of each letter
const t = readline(); // The word to print in ASCII art
const word = t.toUpperCase(); // The word in uppercase
var ids = getIds(word); // Get the id's of each letter in the alphabet's order

for (let i = 0; i < h; i++) { // Loop for the height of the letters
    const az = readline(); // Input of the string of each height of all the letter's ASCII art in alphabetical order
    console.log(getArt(ids, l, az)); // Get the art of this height of the letter's of the word in order
}

function getIds(w){
    let ids = []; // An array for the id's 
    let s = ""; // This string will contain each letter of the word

    for(let i = 0; i < w.length; i++){ // Loop for the length of the word
        s = w.charAt(i); // Get each letter of the word

        if(alphabet.includes(s)){ // If that letter is in the alphabet 
            ids[i] = alphabet.indexOf(s); // Get the id of that letter in the alphabet
        } else { // If the letter is not part of the alphabet
            ids[i] = alphabet.length; // Get the length id of the alphabet
        }
    }
    return ids; // Return the list of id's
}

function getArt(ids, l, az){
    let art = ""; // String that will have the ASCII art of the letters of the word

    for(let i = 0; i < ids.length; i++){ // Loop over the list of id's
        let index1 = ids[i] * l; // Will store the first index of each letter
        let index2 = index1 + l; // Will store the last indes of each letter

        art += az.slice(index1, index2); // Add the string of the letter in question
    }
    return art; // Return the ASCII art of this height of the word
}
