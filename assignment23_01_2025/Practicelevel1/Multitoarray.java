package assignment23_01_2025.Practicelevel1;
import java.util.Scanner;
public class Multitoarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
           int[][] matrix = new int[rows][cols];
         int[] array = new int[rows * cols];
     int index = 0;
          for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
              System.out.print("Enter element [" + i + "][" + j + "]: ");
            matrix[i][j] = sc.nextInt();
             array[index++] = matrix[i][j];
              }
        }
     System.out.print("1D Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}

