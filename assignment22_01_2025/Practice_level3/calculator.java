package assignment22_01_2025.Practice_level3;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the first number:");
        double num1 =sc.nextDouble();
        System.out.print("enter the second number:");
        double num2 = sc.nextDouble();
        System.out.print("enter the operator: ");
        String operation = sc.next();

        switch (operation) {
            case "+":
                System.out.println("the sum of given 2 numbers is:"+(num1+num2));
                break;
        
            case "-":
                System.out.println("the subraction of given 2 numbers is:"+(num1-num2));
                break;
   
            case "*":
                System.out.println("the multiplication of given 2 numbers is:"+(num1*num2));
                break;

            case "/":
            if(num2==0) System.out.println("undefined value");
            else
                System.out.println("the divison of given 2 numbers is:"+(num1/num2));
                break;
        
            default:
                System.out.println("invalid operator");
                break;
        }
        }
    }
        
