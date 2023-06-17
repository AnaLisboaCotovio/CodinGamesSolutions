import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;

class Solution {

    public static void main(String args[]) throws
FileNotFoundException {

        File input = new File("Test Sets/test1.txt");
        Scanner in = new Scanner(input);

        int n = in.nextInt(); // The number of temperatures to analyse
        int closest = Integer.MAX_VALUE; 
        Boolean signt; // TRUE if temperature positive and FALSE if temperature negative

        System.out.println();
        System.out.print("From the  following temperatures: ");

        if (n <= 0) { 
                closest = 0; 
                System.out.print("0");
        }

        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // The temperatures
            System.out.print(t + "  ");

            if(t > 0){ 
                signt = true;
            } else{
                signt = false;
            }

            if (Math.abs(t) < Math.abs(closest)) { 
                closest = t;
            } else {
                if (Math.abs(t) == Math.abs(closest) && signt == true) { 
                    closest = t; 
                } 
            }
        }

        in.close();
        System.out.println();
        System.out.println("The one that is closest to zero is: " + closest); 
        System.out.println();
    }
}
