import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double radius = sc.nextDouble();
        System.out.println("the area of circle is: "+(Math.PI*Math.pow(radius,2)));
    }
}
