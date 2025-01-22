package assignment21_01_2025.PracticeSet1;

import java.util.Scanner;
public class Purchasecost {
        public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
             double unitPrice=sc.nextDouble();
             int quantity=sc.nextInt();
             System.out.println("The total price is "+unitPrice*quantity+" INR if the quantity is "+quantity+" and unit price is "+unitPrice+" INR");
    }
}

