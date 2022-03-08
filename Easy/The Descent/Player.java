import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        while (true) { // game loop

            // VARIABLES
            int max = 0; // This will be the height of the tallest mountain 
            int idmax = 0; // This will be the index of the tallest mountain 
 
            for (int i = 0; i < 8; i++) { // Evaluation of all the maountains remaining in each turn
                int mountainH = in.nextInt(); // represents the height of one mountain
            
                if(mountainH > max){ // Compare each mountain height with the height of the current max
                    max = mountainH; // if the mountain is taller it becomes the new max
                    idmax = i; // and the id of that max mountain becomes the id of the max 
                }
            }
            System.out.println(idmax); // Code to fire upon the tallest mountain 
    }
}