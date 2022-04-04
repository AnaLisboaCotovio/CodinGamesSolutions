const alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 

const l = parseInt(readline()); // The length of each letter
const h = parseInt(readline()); // The height of each letter
const t = readline(); // The word to print in ASCII art
const word = t.toUpperCase(); 
var ids = getIds(word); // Stores the id's of each letter in the alphabet

for (let i = 0; i < h; i++) {
    const az = readline(); // The ASCII Art string
    console.log(getArt(ids, l, az));
}

function getIds(w){
    let ids = [];
    let s = "";

    for(let i = 0; i < w.length; i++){ 
        s = w.charAt(i); // Get each letter of the word

        if(alphabet.includes(s)){ 
            ids[i] = alphabet.indexOf(s); 
        } else {
            ids[i] = alphabet.length; 
        }
    }
    return ids; 
}

function getArt(ids, l, az){
    let art = ""; 

    for(let i = 0; i < ids.length; i++){ 
        let index1 = ids[i] * l; // Stores first index of each letter
        let index2 = index1 + l; // Stores last index of each letter

        art += az.slice(index1, index2); 
    }
    return art;
}
