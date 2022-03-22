import java.util.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        while (true) { // Game loop - Loops everytime the ship changes direction
            int max = 0; // The max height of a mountain
            int idmax = 0; // The id of the mountain with the maximum height
            for (int i = 0; i < 8; i++) { // Looping within the 8 - the amount of mountains everytime the 
                int mountainH = in.nextInt(); // Represents the height of one mountain just given as input
            
                if(mountainH > max){ // If the input mountain's height is bigger than the maximum
                    max = mountainH; // Substitute de maximum height for the input's height
                    idmax = i; // And the id of the maximum height mountain for the id of the input's mountain
                }
            }
            System.out.println(idmax); // Destroy the tallest mountain
        }
    }
}
