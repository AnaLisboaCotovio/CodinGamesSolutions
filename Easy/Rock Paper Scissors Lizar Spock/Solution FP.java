import java.util.*;

class Solution {

    // Which symbols win against which - first winner and second loser
    private static List <String> pattern = Arrays.asList("CP", "CL", "PR", "PS", "RL", "RC", "LS", "LP", "SC", "SR"); 

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // The number of players

        Queue <Integer> winnersNum = new LinkedList <> (); 
        Queue <String> winnersSign = new LinkedList <> (); 
        ArrayList <Integer> losers = new ArrayList <> ();
        ArrayList <Integer> lostTo = new ArrayList <> (); 

        for (int i = 0; i < n; i++) { 
            winnersNum.add(in.nextInt());
            winnersSign.add(in.next());
        }

        in.close();

        int num1 = 0; 
        int num2 = 0;

        String sign1 = "";
        String sign2 = ""; 

        while(winnersNum.size() > 1){ 
            num1 = winnersNum.poll(); 
            num2 = winnersNum.poll(); 

            sign1 = winnersSign.poll(); 
            sign2 = winnersSign.poll();

            Boolean res = Duel(num1, sign1, num2, sign2); // TRUE - first player wins and FALSE - second player wins

            if(res == true){
                losers.add(num2); 
                lostTo.add(num1); 

                winnersNum.add(num1); 
                winnersSign.add(sign1); 
            } else {
                losers.add(num1); 
                lostTo.add(num2);

                winnersNum.add(num2); 
                winnersSign.add(sign2);
            }
        }

        int winner = winnersNum.poll();  
        System.out.println(winner); 

        String enemies = ""; 
        for(int i = 0; i < n-1; i++){ 
            if(lostTo.get(i) == winner){ 
                enemies += String.valueOf(losers.get(i)) + " "; 
            }
        }

        System.out.println(enemies.substring(0, enemies.length()-1));
    }

    private static Boolean Duel (int player1, String sign1, int player2, String sign2){ 
        if(pattern.contains(sign1 + sign2)) 
            return true; 
        else if(pattern.contains(sign2 + sign1)) 
            return false;
        else if(player1 < player2) 
            return true; 
        else 
            return false; 
    }
}
