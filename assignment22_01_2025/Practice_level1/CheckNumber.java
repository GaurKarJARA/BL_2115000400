package assignment22_01_2025.Practice_level1;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
       double num = sc.nextDouble();
        if(num==0){
            System.out.println("number is zero");
        }
        else if(num*-1<0){
            System.out.println("number is positive");
        }
        else System.out.println("number is negative");
    }
}
