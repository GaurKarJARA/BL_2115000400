package assignment21_01_2025.practiceSet2;
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 2 numbers to be swapped :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int temp; 
        temp = n1;
        n1 = n2; 
        n2 = temp;
        System.out.println(n1+"and"+n2);
    }
}
