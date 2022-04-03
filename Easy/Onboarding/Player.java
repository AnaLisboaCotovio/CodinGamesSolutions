import java.util.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        while (true) { // Game loop
            String enemy1 = in.next(); // Name of enemy 1
            int dist1 = in.nextInt(); // Distance to enemy 1
            String enemy2 = in.next(); // Name of enemy 2
            int dist2 = in.nextInt(); // Distance to enemy 2

            in.close();

            if(dist1 < dist2){ 
                System.out.println(enemy1); 
            } else{ 
                System.out.println(enemy2); 
            }
        }
    }
}
