package assignment22_01_2025.Practice_level2;

import java.util.Scanner; 
public class Percentage {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter marks for Physics: ");
            int physics = sc.nextInt();
            System.out.print("Enter marks for Chemistry: ");
            int chemistry = sc.nextInt();
            System.out.print("Enter marks for Maths: ");
            int maths = sc.nextInt();
            int totalMarks = physics + chemistry + maths;
            double percentage = totalMarks / 3.0;
    
            String grade;
            String remarks;
    
            if (percentage >= 80) {
                grade = "A";
                remarks = "Excellent";
            } else if (percentage >= 70) {
                grade = "B";
                remarks = "Very Good";
            } else if (percentage >= 60) {
                grade = "C";
                remarks = "Good";
            } else if (percentage >= 50) {
                grade = "D";
                remarks = "Fair";
            } else if (percentage >= 40) {
                grade = "E";
                remarks = "Needs Improvement";
            } else {
                grade = "R";
                remarks = "Repeat Required";
            }
    
            System.out.println("\n--- Result ---");
            System.out.println("Average Marks: " + percentage + "%");
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);
        }
    }
    
