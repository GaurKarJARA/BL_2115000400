import java.util.Scanner;

public class SpringSeason {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter month: ");
        int month = sc.nextInt();
        System.out.print("enter day: ");
        int day = sc.nextInt();
        if(isSpringseason(month, day)) System.out.println(" Its spring season");
        else System.out.println("it's not spring season");
    
    }
    public static boolean isSpringseason(int month,int day){
        if((month==3 && day >= 20) || (month==4) || (month==5)|| (month==6 && day<=20) ) return true;
        else return false; 

    }

}
