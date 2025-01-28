package PracticeLevel_1;
import java.util.Scanner;

public class NumberOfChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of students:");
        int students = sc.nextInt();
        System.out.print("enter number of chocolates:");
        int chocolates = sc.nextInt();
        System.out.println("chocolates per childern is "+NumberOfChocolates.Choco(students, chocolates)[0] +" and chocolates remaining is "+NumberOfChocolates.Choco(students, chocolates)[1]);
    }
    public static int[] Choco(int N,int M){
         return new int[] {M/N,M%N};
    }
}
