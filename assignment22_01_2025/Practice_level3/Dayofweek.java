package assignment22_01_2025.Practice_level3;
public class Dayofweek {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int date = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (date + x + 31 * m0 / 12) % 7;
        System.out.println(d0);
        
    }
}
