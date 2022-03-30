import java.util.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int lightX = in.nextInt(); // The X position of the light of power
        int lightY = in.nextInt(); // The Y position of the light of power
        int thorX = in.nextInt(); // Thor's starting X position
        int thorY = in.nextInt(); // Thor's starting Y position

        while (true) { // Game loop
            String direction = ""; // Direction in which thor will move in each turn

            // Compare Thor's coordinates with the light of power's
            // Give a direction for thor to move
            // Change Thor's coordinates accordingly
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

            System.out.println(direction); // Output the direction in which Thor will move this turn
        }
    }
}
