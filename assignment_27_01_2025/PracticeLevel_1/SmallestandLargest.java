import java.util.Scanner;

public class SmallestandLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers : ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        SmallestandLargest.findlargestandsmallest(number1, number2, number3);
    }
    public static void findlargestandsmallest(int n1,int n2,int n3){
        int largest  = n1; 
            if(n2>largest) largest =n2;
        if (n3>largest) largest =n3;
             int smallest = n1; 
                  if (n2<smallest) smallest=n2;
                     if(n3<smallest) smallest = n3;

            System.out.println("the largest and smallest among them are: "+largest+ "and " +smallest+" respectively.");
    }
}