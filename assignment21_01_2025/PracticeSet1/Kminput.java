package assignment21_01_2025.PracticeSet1;
import java.util.Scanner;
public class Kminput {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double km=sc.nextDouble();
        double mile=km*1.6;
        System.out.println("The total miles is :"+mile+" mile for the given "+km +" km");
    }
}
