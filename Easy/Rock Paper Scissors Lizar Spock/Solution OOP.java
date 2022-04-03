import java.util.*;

class Solution {

    private static List <String> pattern = Arrays.asList("CP", "CL", "PR", "PS", "RL", "RC", "LS", "LP", "SC", "SR"); // Which symbols win against which - first winner and second loser

    private static class Player {
        // States
        private int number;
        private String sign; 
        private ArrayList<Integer> enemies = new ArrayList <Integer>(); // List of enemies that went against the player
    
        // Constructor
        private Player(int num, String sign){
            this.number = num;
            this.sign = sign;
        }

        // Behaviours
        public void addEnemy(int idEnemy){ // Add enemies to the ArrayList of enemies
            this.enemies.add(idEnemy);
        }

        public String enemyString(){ // Return the enemies' list as a string
            String s = "";
            for(Integer i : enemies){
                s += String.valueOf(i) + " ";
            }

            return s.substring(0, s.length() - 1);
        }
    }

    public static void main(String args []){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // The number of players
        Queue <Player> competition = new LinkedList <> (); // A queue of the tournament with all the Players - Loser's will be removed later

        for(int i = 0; i < n; i++){ // Add new player with each number and sign
            int np = in.nextInt();
            String sp = in.next();
            competition.add(new Player(np, sp));
        }
        in.close();

        while (competition.size() > 1){ // Loop while there is more than 1 player in the competition's queue
            competition.add(Duel(competition.poll(), competition.poll())); // Have a duel between the first 2 player in the competition queue and add the winner to the end of the queue
        }

        Player winner = competition.poll(); // Get the winner
        System.out.println(winner.number); // Print the winner's number
        System.out.println(winner.enemyString()); // Print the winner's enemies' string
    }

    private static Player Duel(Player p1, Player p2){
        // Add each player to the other's enemies' list
        p1.addEnemy(p2.number);
        p2.addEnemy(p1.number);

        if(pattern.contains(p1.sign + p2.sign)){ // If the pattern has the sign of the first player and the sign of the second player in this order
            return p1; // The first player wins
        } else if(pattern.contains(p2.sign + p1.sign)){ // If the pattern has the sign of the second player and the sign of the first player in this order
            return p2; // The second player wins

        // If the pattern doesn't have the signs of both players together, this means the sign is the same
        } else if(p1.number < p2.number){ // If the number of the first player is smaller than the second one (as requested in the rules)
            return p1; // The first player wins
        } else // If the number of the second player is smaller than the first one (as requested in the rules)
            return p2; // The second player wins
    }
}
