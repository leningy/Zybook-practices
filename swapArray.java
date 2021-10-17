/* Write a method swapArrayEnds() that swaps the first and last elements of its array parameter. */

import java.util.Scanner;

public class ModifyArray {

    public static void swapArrayEnds(int[] arr){
        int temp = arr[0];

        arr[0] = temp;
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

    }


      public static void main (String [] args) {
          Scanner scnr = new Scanner(System.in);
          int numElem = 4;
          int[] sortArray = new int[numElem];
          int i;
          int userNum;

          for (i = 0; i < sortArray.length; ++i) {
              sortArray[i] = scnr.nextInt();
          }

          swapArrayEnds(sortArray);

          for (i = 0; i < sortArray.length; ++i) {
              System.out.print(sortArray[i]);
              System.out.print(" ");
          }
          System.out.println("");
      }
}
