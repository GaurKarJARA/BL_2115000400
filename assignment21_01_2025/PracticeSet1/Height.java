package assignment21_01_2025.PracticeSet1;

import java.util.Scanner;
public class Height {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float height=sc.nextFloat();
        double inch=height/2.54;
        double feet=inch/12;
        System.out.println("Your height in cm is "+height + " while in feet is "+feet+" and inches is "+inch);

    }
}
