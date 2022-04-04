var inputs = readline().split(' ');
const lightX = parseInt(inputs[0]); 
const lightY = parseInt(inputs[1]);
let thorX = parseInt(inputs[2]); 
let thorY = parseInt(inputs[3]); 

while (true) {
    let direction = ""; 
    
    if(lightX > thorX && lightY < thorY){
        direction = "NE";
        thorX++;
        thorY--;
    }else{
        if(lightX < thorX && lightY < thorY){
            direction = "NW";
            thorX--;
            thorY--;
        }else{
            if(lightX < thorX && lightY > thorY){
                direction = "SW";
                thorX--;
                thorY++;
            }else{
                if(lightX > thorX && lightY > thorY){
                    direction = "SE";
                    thorX++;
                    thorY++;
                }else{
                    if(lightX > thorX){
                        direction = "E";
                        thorX++;
                    }else{
                        if(lightX < thorX){
                            direction = "W";
                            thorX--;
                        }
                    }

                    if(lightY > thorY){
                        direction = "S";
                        thorY++;
                    }else{
                        if(lightY < thorY){
                           direction = "N";
                            thorY--; 
                        }
                    }
                }
            }
        }
    }

    console.log(direction); 
}
