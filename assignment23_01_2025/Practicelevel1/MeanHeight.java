package assignment23_01_2025.Practicelevel1;

import java.util.Scanner;
public class MeanHeight {
      public static void main(String[] args) { 
           double[] heights = new double[11];
            double sum = 0.0;
            Scanner sc = new Scanner(System.in);

       for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
         double mean = sum / heights.length;
        System.out.println("Mean height: " + mean);
      }
}

