package assignment22_01_2025.Practice_level3;
import java.util.Scanner;
public class Countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter integer: ");
        int num = sc.nextInt();
        int count =0 ;
        if(num ==0) System.out.println("number of digits is:1");
       else{ 
        while(num!=0){
            num/=10;
            count++;
        }
          System.out.println("number of digits in integer: "+count);
    }
    }
}
