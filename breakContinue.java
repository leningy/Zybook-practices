/* Check if two user input is the same. */


import java.util.Scanner;

public class SimonSays {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        String simonPattern;
        String userPattern;
        int userScore;
        int i;

        userScore = 0;

        simonPattern = scnr.next();
        userPattern  = scnr.next();

       for (i = 0; i < simonPattern.length(); ++i) {
           if (simonPattern.charAt(i)== userPattern.charAt(i)) {userScore++;} // checks how many char match before one doesn't
       else {
           break; //exit loop as soon as one char doesn't match
       }
}


        System.out.println("userScore: " + userScore);

        return;
    }
}
