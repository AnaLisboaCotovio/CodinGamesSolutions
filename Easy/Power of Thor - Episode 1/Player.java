import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // VARIABLES
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position
        int thorX = initialTx; // Thor's current X position
        int thorY = initialTy; // Thor's current Y position
        String direction = ""; // The direction Thor will be taking

        while (true) { // game loop
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move.

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

            System.out.println(direction); // The final direction Thor is taking this turn
        }
    }
}