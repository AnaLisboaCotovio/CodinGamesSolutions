import java.util.*;

class Solution {

    private static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // A string that contains all the letters of the alphabet in english

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int l = in.nextInt(); // The length of each letter
        int h = in.nextInt(); // The height of each letter
        if (in.hasNextLine()) { // If there is another line of input (this loop is required for the program to run)
            in.nextLine();
        }
        String t = in.nextLine(); // The word to print in ASCII art
        String word = t.toUpperCase(); // The word in uppercase
        int [] ids = getIds(word); // Get the id's of each letter in the alphabet's order

        for (int i = 0; i < h; i++) { // Loop for the height of the letters
            String az = in.nextLine(); // Input of the string of each height of all the letter's ASCII art in alphabetical order
            System.out.println(getArt(ids, l, az)); // Get the art of this height of the letter's of the word in order
        }
    }

    public static int [] getIds (String w){
        int [] ids = new int [w.length()]; // An array for the id's 
        String s = ""; // This string will contain each letter of the word

        for(int i = 0; i < w.length(); i++){ // Loop for the length of the word
            s = w.substring(i, i+1); // Get each letter of the word

            if(alphabet.contains(s)){ // If that letter is in the alphabet 
                ids[i] = alphabet.indexOf(s); // Get the id of that letter in the alphabet
            } else{ // If the letter is not part of the alphabet
                ids[i] = alphabet.length(); // Get the length id of the alphabet
            }
        }
        return ids; // Return the list of id's
    }


    public static String getArt(int [] ids, int length, String az){
        String art = ""; // String that will have the ASCII art of the letters of the word

        for(int i = 0; i < ids.length; i++){ // Loop over the list of id's
                int index1 = ids[i] * length; // Will store the first index of each letter
                int index2 = index1 + length; // Will store the last indes of each letter

                art += az.substring(index1 , index2); // Add the string of the letter in question
        }
        return art; // Return the ASCII art of this height of the word
    }
}
