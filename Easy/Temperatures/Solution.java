import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // The number of temperatures to analyse
        int closest = Integer.MAX_VALUE; 
        Boolean signt; // TRUE if temperature positive and FALSE if temperature negative

        if (n <= 0) { 
                closest = 0; // Set 0 as the closest temperature (requested in the rules)
        }

        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // The temperatures

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

        System.out.println(closest); 
    }
}
