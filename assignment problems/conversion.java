import java.util.*;
public class conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Celsius = sc.nextInt();
        System.out.println("the temperature in fahrenheit is: "+((Celsius * 9/5) + 32));
    }
}
