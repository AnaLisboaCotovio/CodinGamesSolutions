import java.util.*;

class Solution {

    private static List <String> pattern = Arrays.asList("CP", "CL", "PR", "PS", "RL", "RC", "LS", "LP", "SC", "SR");

    private static class Player {
        // States
        private int number;
        private String sign;
        private ArrayList<Integer> enemies = new ArrayList <Integer>();
    
        // Behaviours
        // Constructor
        private Player(int num, String sign){
            this.number = num;
            this.sign = sign;
        }

        // Add enemies to the list of enemies
        public void addEnemy(int idEnemy){
            this.enemies.add(idEnemy);
        }

        // Get the enemies as a string to print at the end the winner's
        public String enemyString(){
            String s = "";
            for(Integer i : enemies){
                s += String.valueOf(i) + " ";
            }

            return s.substring(0, s.length() - 1);
        }
    }

    public static void main(String args []){
        Scanner in = new Scanner(System.in);

        // Initializes
        int n = in.nextInt();
        Queue <Player> competition = new LinkedList <> ();

        for(int i = 0; i < n; i++){
            int np = in.nextInt();
            String sp = in.next();
            competition.add(new Player(np, sp));
        }
        in.close();

        while (competition.size() > 1){
            competition.add(Duel(competition.poll(), competition.poll()));
        }

        Player winner = competition.poll();
        System.out.println(winner.number);
        System.out.println(winner.enemyString());
    }

    private static Player Duel(Player p1, Player p2){
        // Add each player to the other's enemies list
        p1.addEnemy(p2.number);
        p2.addEnemy(p1.number);

        // Compare each player's chosen sign
        if(pattern.contains(p1.sign + p2.sign)){
            return p1;
        } else if(pattern.contains(p2.sign + p1.sign)){
            return p2;
        } else if(p1.number < p2.number){
            return p1;
        } else
            return p2;
    }
}