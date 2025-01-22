import java.util.Scanner;
public class YardsAndMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double feet=sc.nextDouble();
        double yard=feet/3;
        double mile=yard/1760;
        System.out.println("The distance in feets is "+feet+" while in yards is "+yard+" and in miles is "+mile);
    }   
}
