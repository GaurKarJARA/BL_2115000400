package PracticeLevel_1;
import java.util.Scanner;

public class TriangularPark{
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter sides of triangle :");
    double s1 = sc.nextDouble();
    double s2 = sc.nextDouble();
    double s3 = sc.nextDouble();
    System.out.println("the number of rounds is: "+TriangularPark.rounds(s1, s2, s3));
 }
  public static double rounds(double s1,double s2,double s3){
            return Math.ceil(5000/(s1+s2+s3));
 }
}