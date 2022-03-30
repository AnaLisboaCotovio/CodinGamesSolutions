import java.util.*;

class Solution {

    private static List <String> pattern = Arrays.asList("CP", "CL", "PR", "PS", "RL", "RC", "LS", "LP", "SC", "SR"); // Which symbols win against which - first winner and second loser

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // The number of players

        Queue <Integer> winnersNum = new LinkedList <> (); // A queue initialized with all the players numbers in the order as they are given
        Queue <String> winnersSign = new LinkedList <> (); // A queue initialized with all the players signs in the order as they are given
        ArrayList <Integer> losers = new ArrayList <> (); // A list initialized without values that will have the losers' numbers added
        ArrayList <Integer> lostTo = new ArrayList <> (); // A list initialized without values that will have to whom the loser's lost to added

        for (int i = 0; i < n; i++) { // Add all players numbers and signs to the respective queues
            winnersNum.add(in.nextInt());
            winnersSign.add(in.next());
        }

        in.close();

        // When comparing 2 players in a Duel:
        int num1 = 0; // Number of the first player
        int num2 = 0; // Number of the second player

        String sign1 = ""; // Sign of the first player
        String sign2 = ""; // Sign of the second player

        while(winnersNum.size() > 1){ // Loop while there are more than 1 player in the queue of the players numbers
            num1 = winnersNum.poll(); // Remove the index 1 number of the queue and assign it to be used later
            num2 = winnersNum.poll(); // Remove the new index 1 number of the queue and assign it to be used later

            sign1 = winnersSign.poll(); // Remove the index 1 sign of the queue and assign it to be used later
            sign2 = winnersSign.poll(); // Remove the new index 1 sign of the queue and assign it to be used later

            Boolean res = Duel(num1, sign1, num2, sign2); // Call the method Duel on the 2 players and return TRUE if the first player wins and FALSE if the second one wins

            if(res == true){ // If the first player wins
                losers.add(num2); // Add the number of the second player to the list of losers
                lostTo.add(num1); // Add the number of the first player to the list of lost to

                winnersNum.add(num1); // Add back to the end of the queue the number of the first player
                winnersSign.add(sign1); // Add back to the end of the queue the sign of the first player
            } else { // If the second player wins
                losers.add(num1); // Add the number of the first player to the list of losers
                lostTo.add(num2); // Add the number of the second player to the list of lost to

                winnersNum.add(num2); // Add back to the end of the queue the number of the second player
                winnersSign.add(sign2); // Add back to the end of the queue the sign of the second player
            }
        }

        int winner = winnersNum.poll();  // Remove the winner's number from the queue of numbers and assign it to a variable
        System.out.println(winner); // Print the number of the winner

        String enemies = ""; // It will take the list of enemies that lost to the winner as a string
        for(int i = 0; i < n-1; i++){ // Loop over the loser's list
            if(lostTo.get(i) == winner){ // If the player lost to the winner
                enemies += String.valueOf(losers.get(i)) + " "; // add the number of the loser to the enemies string
            }
        }

        System.out.println(enemies.substring(0, enemies.length()-1)); // Print the string of enemies of the winner removing the last space
    }

    // Method that will compare 2 players in a Duel
    private static Boolean Duel (int player1, String sign1, int player2, String sign2){ 
        if(pattern.contains(sign1 + sign2)) // If the pattern has the sign of the first player and the sign of the second player in this order
            return true; // The first player wins
        else if(pattern.contains(sign2 + sign1)) // If the pattern has the sign of the second player and the sign of the first player in this order
            return false; // The second player wins

        // If the pattern doesn't have the signs of both players together, this means the sign is the same
        else if(player1 < player2) // If the number of the first player is smaller than the second one (as requested in the rules)
            return true; // The first player wins
        else // If the number of the first player is smaller than the second one (as requested in the rules)
            return false; // The second player wins
    }
}
