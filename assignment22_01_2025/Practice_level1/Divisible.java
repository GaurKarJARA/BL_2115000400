package assignment22_01_2025.Practice_level1;
import java.util.Scanner;
public class Divisible {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

    	System.out.println("Enter a number:");
    	int num = input.nextInt();
    	if (num % 5 == 0) {
        	System.out.println("The number " + num + " is divisible by 5");
    	} 
      else {
        	System.out.println("The number " + num +" is not divisible by 5");
    	}
	}
}



