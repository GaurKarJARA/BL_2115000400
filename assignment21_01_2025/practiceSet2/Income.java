import java.util.Scanner;
public class Income {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double salary=sc.nextDouble();
        double bonus=sc.nextDouble();
        double result=salary+bonus;
        System.out.println("The salary is "+salary+" INR and the  bonus is "+bonus+" INR Hence total income is "+result);
    }
}