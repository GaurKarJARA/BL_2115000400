package assignment22_01_2025.Practice_level2;

import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();
        int GreatestFactor=1;
        for(int i=1;i<num;i++){
                if(num%i==0){
                    GreatestFactor =i ;
                }
        }
        System.out.println("greatest factor of "+num+" is "+GreatestFactor);
    }

}
