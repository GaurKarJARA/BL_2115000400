package assignment22_01_2025.Practice_level3;

import java.util.Scanner;

public class Harshadnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int copynum = num;
        int sum=0;
        while(num !=0){
             sum += num%10;
             num /=10;
        }
        if(copynum%sum==0){
            System.out.println("number is harshad number");
    }
    else System.out.println("number is not harshad number");
}
}