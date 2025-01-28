import java.util.Scanner;

public class SumofNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("the sum is :"+SumofNaturalNumbers.Naturalnumbers(number));
    }
    public static int Naturalnumbers(int n){
        return (n*(n+1))/2;
    }
}
