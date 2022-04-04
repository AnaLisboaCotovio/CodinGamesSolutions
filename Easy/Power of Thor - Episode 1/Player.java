import java.util.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int lightX = in.nextInt(); 
        int lightY = in.nextInt(); 
        int thorX = in.nextInt(); 
        int thorY = in.nextInt(); 

        while (true) { 
            String direction = ""; 

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

            System.out.println(direction);
        }
    }
}
