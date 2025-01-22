import java.util.Scanner;
public class FahrenheitConversion {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double celsius=sc.nextDouble();
        double fahrenheit=(celsius*1.8)+32;
        System.out.println("The "+celsius+" celsius is "+fahrenheit+" fahrenheit ");
    }
}