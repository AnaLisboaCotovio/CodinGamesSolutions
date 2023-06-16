import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;

class SolutionOOP {

    // Which symbols win against which - first winner and second loser
    private static List <String> pattern = Arrays.asList("CP", "CL", "PR", "PS", "RL", "RC", "LS", "LP", "SC", "SR");

    private static class Player {
        // States
        private int number;
        private String sign; 
        private ArrayList<Integer> enemies = new ArrayList <Integer>(); 
    
        // Constructor
        private Player(int num, String sign){
            this.number = num;
            this.sign = sign;
        }

        // Behaviours
        public void addEnemy(int idEnemy){ 
            this.enemies.add(idEnemy);
        }

        public String enemyString(){
            String s = "";
            for(Integer i : enemies){
                s += String.valueOf(i) + " ";
            }

            return s.substring(0, s.length() - 1);
        }
    }

    public static void main(String args []) throws
FileNotFoundException {

        File input = new File("Test Sets/test1.txt"); // Paste Source path of the txt file of the input
        Scanner in = new Scanner(input);

        int n = in.nextInt(); // The number of players
        Queue <Player> competition = new LinkedList <> (); 

        for(int i = 0; i < n; i++){
            int np = in.nextInt();
            String sp = in.next();
            competition.add(new Player(np, sp));
        }
        in.close();

        while (competition.size() > 1){ 
            // Duel the first 2 player in the competition and add the winner to the end of the queue
            competition.add(Duel(competition.poll(), competition.poll()));
        }

        Player winner = competition.poll(); 
        System.out.println();
        System.out.println("The winner was Player: " + winner.number); 
        System.out.println("This Player went up against the following players: " + winner.enemyString()); 
        System.out.println();
    }

    private static Player Duel(Player p1, Player p2){
        p1.addEnemy(p2.number);
        p2.addEnemy(p1.number);

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
