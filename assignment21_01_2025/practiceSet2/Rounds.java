import java.util.Scanner;
public class Rounds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double s1=sc.nextDouble();
        double s2=sc.nextDouble();
        double s3=sc.nextDouble();
        double perimeter=s1+s2+s3;
        double rounds=perimeter/5;
        System.out.println("The total number of rounds the athlete will run is "+rounds+" to complete 5 km");
    }
}