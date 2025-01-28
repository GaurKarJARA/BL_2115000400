package PracticeLevel_1;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        QuotientAndRemainder.QuoAndRem(number1, number2);
    }
    public static void QuoAndRem(int n1,int n2){
        System.out.println("the quotient is: "+n1/n2+" and remainder is "+n1%n2);
    }
}