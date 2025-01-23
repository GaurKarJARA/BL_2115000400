package assignment22_01_2025.Practice_level3;
import java.util.Scanner;
public class Abundant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum >num){
            System.out.println("abundant number");
        }
        else System.out.println("not a abundant number");
    }
}
