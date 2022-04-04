while (true) { 
    let max = 0; 
    let idmax = 0; 

    for (let i = 0; i < 8; i++) { 
        const mountainH = parseInt(readline()); // The height of each mountain

        if(mountainH > max){ 
            max = mountainH; 
            idmax = i; 
        }
    }
    console.log(idmax); 
}
