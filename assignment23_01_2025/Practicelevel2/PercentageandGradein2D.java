package assignment23_01_2025.Practicelevel2;
import java.util.Scanner;
public class PercentageandGradein2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int NumOfStudents = sc.nextInt();
        int[] physics = new int[NumOfStudents];
        int[] chemistry = new int[NumOfStudents];
        int[] maths = new int[NumOfStudents];
        double[] percentage = new double[NumOfStudents];

        for (int i = 0; i < NumOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            physics[i] = sc.nextInt();
            if (physics[i] < 0) {
                System.out.println("Enter positive value.");
                i--;
                continue;
            }

            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextInt();
            if (chemistry[i] < 0) {
                System.out.println("Enter positive value.");
                i--;
                continue;
            }
            System.out.print("Maths: ");
            maths[i] = sc.nextInt();
            if (maths[i] < 0) {
                System.out.println("Enter positive value.");
                i--;
                continue;
            }

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
        }

        for (int i = 0; i < NumOfStudents; i++) {
            if (percentage[i] >= 80) {
                System.out.println("Percentage calculated: " + percentage[i] +
                                   " Level: 4,Above agency-normalized standards");
            } else if (percentage[i] >= 70 && percentage[i] <= 79) {
                System.out.println("Percentage calculated: " + percentage[i] +
                                   " Level: 3,at agency-normalized standards");
            } else if (percentage[i] >= 60 && percentage[i] <= 69) {
                System.out.println("Percentage calculated: " + percentage[i] +
                                   " Level: 2,Below but approaching agency-normalized standards");
            } else if (percentage[i] >= 50 && percentage[i] <= 59) {
                System.out.println("Percentage calculated: " + percentage[i] +
                                   " Level: 1,well below agency-normalized standards");
            } else if (percentage[i] >= 40 && percentage[i] <= 49) {
                System.out.println("Percentage calculated: " + percentage[i] +
                                   " Level: 1-,too below agency-normalized standards");
            } else {
                System.out.println("Percentage calculated: " + percentage[i] +
                                   " Level: 4,remedial standards");
   }
         }
     }
} 

