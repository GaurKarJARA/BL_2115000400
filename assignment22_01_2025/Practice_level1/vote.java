package assignment22_01_2025.Practice_level1;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        
                System.out.println("Enter the age of the person:");
                int age = input.nextInt();
        
                if (age >= 18) {
                    System.out.println("The person's age is " + age + " and can vote.");
                } else {
                    System.out.println("The person's age is " + age + " and cannot vote.");
                }
            }
        }
