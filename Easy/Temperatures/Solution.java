import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // VARIABLES
        int n = in.nextInt(); // the number of temperatures to analyse
        int closest = Integer.MAX_VALUE; // Max value so it can be shortened 
        Boolean signt; // Will store TRUE if positive and FALSE if negative

        if (n <= 0) { // If there are no temperatures
                closest = 0;
        }
        
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); 

            if(t > 0){ signt = true;} 
            else{ signt = false;}

            if (Math.abs(t) < Math.abs(closest)) { // If the positive value of the number is  smaller the closest one
                closest = t;
            } else {
                if (t == Math.abs(closest) && signt == true) { // If the positive value of the number is the same as the closest one and the t is positive
                    closest = t;
                } else{ 
                    if(t == closest && signt == false){ // If the value of the number is the same as the closest one and the t is negative
                        closest = t;
                    }
                }
            }
        }
        
        System.out.println(closest);
    }
}