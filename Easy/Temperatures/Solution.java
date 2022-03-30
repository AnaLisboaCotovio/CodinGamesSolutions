import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // The number of temperatures to analyse
        int closest = Integer.MAX_VALUE; // The closest value to 0 initialized as the max value so it can be shortened 
        Boolean signt; // Will store TRUE if positive and FALSE if negative

        if (n <= 0) { // If there are no temperatures
                closest = 0; // Set 0 as the closest temperature (requested in the rules)
        }

        for (int i = 0; i < n; i++) { // For all the temperatures
            int t = in.nextInt(); // The temperature
            if(t > 0){ // Set the sign of that temperature
                signt = true;
            } else{
                signt = false;
            }

            // Set the closes value to the temperature in question in these 2 scenarios:
            if (Math.abs(t) < Math.abs(closest)) { // If the absolute value of the number is smaller than the absolute value of the closest one
                closest = t;
            } else {
                if (Math.abs(t) == Math.abs(closest) && signt == true) { // If the absolute value of the number is the same as the absolute value of the closest one and it is positive
                    closest = t; 
                } 
            }
        }

        System.out.println(closest); // Output the temperature that is closest to 0
    }
}
