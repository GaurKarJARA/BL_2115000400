package assignment23_01_2025.Practicelevel2;
import java.util.Scanner;
public class BMIcalculator2D {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[][] personInfo = new double[n][3];
        String[] weightInfo = new String[n];
        for (int i = 0; i < n; i++) {
            double weight, height;
            do {
                  System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                   weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            } while (weight <= 0);
            do {
                System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                height = sc.nextDouble();
              if (height <= 0) {
                    System.out.println("Please enter a positive value for height.");
            }
            } while (height <= 0);

         personInfo[i][0] = weight;
            personInfo[i][1] = height;
            personInfo[i][2] = weight / (height * height);
     if (personInfo[i][2] < 18.5) {
               weightInfo[i] = "Underweight";
            } else if (personInfo[i][2] >= 18.5 && personInfo[i][2] <= 24.9) {
              weightInfo[i] = "Normal weight";
            } else if (personInfo[i][2] >= 25 && personInfo[i][2] <= 29.9) {
              weightInfo[i] = "Overweight";
            } else {
                weightInfo[i] = "Obese";
            }
        }
        System.out.println("\nPerson | Weight (kg) | Height (m) | BMI  | Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%5d | %12.2f | %11.2f | %.2f | %s\n", i + 1, personInfo[i][0], personInfo[i][1], personInfo[i][2], weightInfo[i]);
        }
    }
}
