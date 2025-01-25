package assignment23_01_2025.Practicelevel2;
import java.util.Scanner;
public class BMIcalculator {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();
           double[] heights = new double[n];
           double[] weights = new double[n];
           double[] BMI = new double[n];
           String[] status = new String[n];
     for (int i = 0; i < n; i++) {
            System.out.printf("Enter height (in meters) for person %d: ", i + 1);
            heights[i] = sc.nextDouble();
            System.out.printf("Enter weight (in kg) for person %d: ", i + 1);
            weights[i] = sc.nextDouble();
            BMI[i] = weights[i] / (heights[i] * heights[i]);
            if (BMI[i] < 18.5) {
                status[i] = "Underweight";
            } else if (BMI[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (BMI[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
          }
     for (int i = 0; i < n; i++) {
            System.out.printf("Person %d: Height=%.2f, Weight=%.2f, BMI=%.2f, Status=%s\n", i + 1, heights[i], weights[i], BMI[i], status[i]);
            }
     }
   }

