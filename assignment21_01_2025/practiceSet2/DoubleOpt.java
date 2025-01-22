import java.util.Scanner;
public class DoubleOpt {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double o1=a+b*c;
        double o2=a*b+c;
        double o3=c+a/b;
        double o4=a%b+c;
        System.out.println("The result of Int operations are "+o1+" , "+o2+" , "+o3+" and "+o4);
    }
}