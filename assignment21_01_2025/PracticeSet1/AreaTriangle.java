import java.util.Scanner;
public class AreaTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double height=sc.nextDouble();
        double base=sc.nextDouble();
        double area=(height*base)/2;
        System.out.println("Area of the triangle is :"+area);

    }    
}
