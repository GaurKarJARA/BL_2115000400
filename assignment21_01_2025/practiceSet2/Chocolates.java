import java.util.Scanner;
public class Chocolates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfChocolates=sc.nextInt();
        int numberOfChildren=sc.nextInt();
        int chocolates=numberOfChocolates/numberOfChildren;
        int remaining=numberOfChocolates%numberOfChildren;
        System.out.println("The number of chocolates each child gets is "+chocolates+"  and the number of remaining chocolates are "+remaining);
    }
}