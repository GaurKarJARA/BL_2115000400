package assignment23_01_2025.Practicelevel2;

import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        final int EmployeeCount = 10;
          double[] salaries = new double[EmployeeCount];
         double[] yearsOfService = new double[EmployeeCount];
         double[] bonus = new double[EmployeeCount];
          double[] newSalaries = new double[EmployeeCount];
          double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;
 
          Scanner sc = new Scanner(System.in);

        for (int i = 0; i < EmployeeCount; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double salary = sc.nextDouble();
            while (salary <= 0) {
                System.out.println("Invalid salary. Enter a positive value.");
                salary = sc.nextDouble();
            }
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            double years = sc.nextDouble();
            while (years < 0) {
                System.out.println("Invalid years of service. Enter a non-negative value.");
                years = sc.nextDouble();
            }
            salaries[i] = salary;
            yearsOfService[i] = years;
        }
        for (int i = 0; i < EmployeeCount; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salaries[i] * 0.05;
            } else {
                bonus[i] = salaries[i] * 0.02;
            }
            newSalaries[i] = salaries[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
          System.out.println("\nTotal bonus payout: " + totalBonus);
           System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);
    }
}

