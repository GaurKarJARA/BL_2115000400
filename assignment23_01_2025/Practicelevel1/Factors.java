package assignment23_01_2025.Practicelevel1;

 import java.util.Scanner;
public class Factors {
        public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = sc.nextInt();
      int max_Factors = 10;
      int[] factors = new int[max_Factors];
      int index = 0;
       for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    if (index == max_Factors) {
                        max_Factors *= 2;
                        int[] temp = new int[max_Factors];
                        System.arraycopy(factors, 0, temp, 0, factors.length);
                        factors = temp;
                    }
                    factors[index++] = i;
                }
            }
            System.out.print("Factors: ");
            for (int i = 0; i < index; i++) {
                System.out.print(factors[i] + " ");
            }
         }
    }
