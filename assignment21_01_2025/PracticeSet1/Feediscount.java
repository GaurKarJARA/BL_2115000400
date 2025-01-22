package assignment21_01_2025.PracticeSet1;

import java.util.Scanner;

public class Feediscount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double fee=sc.nextDouble();
        double discountPercent=sc.nextDouble();
        double discount=fee/discountPercent;
        double discountedFee=fee-discount;
        System.out.println(" The discount amount is :"+discount+" INR and final discounted fee is :"+discountedFee+" INR");
    }
}

