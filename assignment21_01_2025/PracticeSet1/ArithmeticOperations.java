import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       float n1=sc.nextFloat();
       float n2=sc.nextFloat();
       float add=n1+n2;
       float sub=n1-n2;
       float multi=n1*n2;
       float division=n1/n2;
       System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+n1+" and "+n2+" is "+add+" , "+sub+" , "+multi+" and "+division); 
    }
}