import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number: ");
        int number = sc.nextInt();
       CheckNumber.numbercheck(number);
    }
    public static void numbercheck(int number){
            if(number>0) System.out.println("the number is positive"); 
            else if(number<0) System.out.println("the number is negative");
            else System.out.println("the number is zero");
        }
}
