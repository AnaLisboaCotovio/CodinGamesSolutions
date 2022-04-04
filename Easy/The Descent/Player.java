import java.util.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        while (true) { 
            int max = 0; 
            int idmax = 0;
            for (int i = 0; i < 8; i++) { 
                int mountainH = in.nextInt(); // The height of each mountain
            
                if(mountainH > max){ 
                    max = mountainH; 
                    idmax = i; 
                }
            }
            System.out.println(idmax); 
        }
    }
}
