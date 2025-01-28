package PracticeLevel_1;
import java.util.Scanner;
public class SimpleInterest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter principal amount:");
    double principal = sc.nextDouble();
    System.out.println("enter Rate of interest:");
    double interestRate = sc.nextDouble();
    System.out.println("enter time period:");
    double time = sc.nextDouble();
    System.out.println("simple interest is "+SimpleInterest.SI(principal,interestRate,time)+"for principal"+principal);
  }
  public static double SI(double principal,double interestRate,double time){
        return (principal*interestRate*time)/100;        
}
}