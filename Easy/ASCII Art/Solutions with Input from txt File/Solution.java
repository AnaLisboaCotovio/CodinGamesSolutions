import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

class Solution {

    private static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String args[]) throws
FileNotFoundException {

        File input = new File("Test Sets/test1.txt");
        Scanner in = new Scanner(input);

        int l = in.nextInt(); // The length of each letter
        int h = in.nextInt(); // The height of each letter
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String t = in.nextLine(); // The word requested in ASCII art
        System.out.println("\n" + "String we want to transform: " + t + "\n" + "String transformmed:");
        String word = t.toUpperCase(); 
        int [] ids = getIds(word); // Stores the id's of each letter in the alphabet

        for (int i = 0; i < h; i++) {
            String az = in.nextLine(); // The ASCII Art string
            System.out.println(getArt(ids, l, az)); 
        }

        in.close();
    }

    public static int [] getIds (String w){
        int [] ids = new int [w.length()]; 
        String s = ""; 

        for(int i = 0; i < w.length(); i++){
            s = w.substring(i, i+1); // Get each letter of the word

            if(alphabet.contains(s)){ 
                ids[i] = alphabet.indexOf(s); 
            } else{ 
                ids[i] = alphabet.length(); 
            }
        }
        return ids;
    }


    public static String getArt(int [] ids, int length, String az){
        String art = "";

        for(int i = 0; i < ids.length; i++){ 
                int index1 = ids[i] * length; // Stores first index of each letter
                int index2 = index1 + length; // Stores last index of each letter

                art += az.substring(index1 , index2);
        }
        return art;
    }
}