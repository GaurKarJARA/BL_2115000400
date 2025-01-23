package assignment22_01_2025.Practice_level2;

import java.util.Scanner;
class BMICal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter height (in cm): ");
        double heightinCM = sc.nextDouble();
        double heightinM = heightinCM / 100;
        double BMI = weight / (heightinM * heightinM);
        System.out.println("Your BMI is: " + BMI);
        if (BMI <= 18.4) {
           System.out.println("Weight status: Underweight");
        } 
        else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Weight status: Normal");
        } 
           else if (BMI >= 25.0 && BMI <= 39.9) {
            System.out.println("Weight status: Overweight");
        }
         else System.out.println("Weight status: Obese");
          }
}
