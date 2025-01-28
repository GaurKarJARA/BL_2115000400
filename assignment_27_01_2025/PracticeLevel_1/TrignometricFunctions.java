package PracticeLevel_1;

import java.util.Scanner;

public class TrignometricFunctions {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter angle in degrees: ");
        double angle= sc.nextDouble();
        System.out.println(TrignometricFunctions.calculateTrigonometricFunctions(angle));
    }

    public static double[] calculateTrigonometricFunctions(double angle){
       double radiens = Math.toRadians(angle);
       return new double[] {Math.sin(radiens),Math.cos(radiens),Math.tan(radiens)};
    }

}
