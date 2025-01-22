import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int quotient=n1/n2;
        int remainder=n1%n2;
        System.out.println("The quotient is "+quotient+" and remainder is "+remainder+" of two number "+n1+" and "+n2);
    }
}