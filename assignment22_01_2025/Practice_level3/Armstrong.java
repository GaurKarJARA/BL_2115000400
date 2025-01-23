package assignment22_01_2025.Practice_level3;

import java.util.Scanner;
public class Armstrong {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
      int num = sc.nextInt();
        int originalsum = num;
        int sum =0;
        while (num>0) {
                sum += Math.pow(num%10,3);
                  num=num/10;
        }
        if(originalsum ==sum){
            System.out.println("given number is armstrong");
        }
        else System.out.println("given number is not armstrong");
        }
}
