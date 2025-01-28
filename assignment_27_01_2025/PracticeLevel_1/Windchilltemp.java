package PracticeLevel_1;

import java.util.Scanner;

public class Windchilltemp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter temperature: ");
       double temperature = sc.nextDouble();
        System.out.println("enter wind speed: ");
       double Windspeed = sc.nextDouble();
       System.out.println();
       System.out.println(Windchilltemp.CalculateWindchill(temperature, Windspeed));
    }
    public static double CalculateWindchill(double temperature,double Windspeed){
       double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(Windspeed,0.16);
       return windChill;
    }
}
