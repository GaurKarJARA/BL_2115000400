package assignment21_01_2025.PracticeSet1;

public class Dividingpens {
    public static void main(String[] args) {
        int pens = 14; 
        int students = 3;
        int pens_per_person = pens/students;
        int remaining_pens = pens%students;
        System.out.println("The pen per student is "+pens_per_person+" and the remaining pen not distributed is "+remaining_pens);

    }
}
