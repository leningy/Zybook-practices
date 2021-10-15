/* Find the maximum value and minimum value in milesTracker. Assign the maximum value to maxMiles, and the minimum value to minMiles.*/

import java.util.Scanner;

public class ArraysKeyValue {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_ROWS = 2;
      final int NUM_COLS = 2;
      int [][] milesTracker = new int[NUM_ROWS][NUM_COLS];
      int i;
      int j;
      int maxMiles; // Assign with first element in milesTracker before loop
      int minMiles; // Assign with first element in milesTracker before loop

      for (i = 0; i < milesTracker.length; i++){
         for (j = 0; j < milesTracker[i].length; j++){
            milesTracker[i][j] = scnr.nextInt();
         }
      }

      maxMiles = milesTracker[0][0];
      minMiles = milesTracker[0][0];
      for (i = 0; i < milesTracker.length; i++){ // the first for loop goes through all rows
          for (j = 0; j < milesTracker[i].length; j++){ // the second for loop goes through all columns
              if(maxMiles < milesTracker[i][j]){
                  maxMiles=milesTracker[i][j];
              }
              if(minMiles > milesTracker[i][j]){
                  minMiles = milesTracker[i][j];
              }
          }
      }


      System.out.println("Min miles: " + minMiles);
      System.out.println("Max miles: " + maxMiles);
   }
}