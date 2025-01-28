package PracticeLevel_2;

import java.util.Scanner;

public class Factors {
      static int[] findfactors(int number){
            int count=0;
            for(int i=1; i<=number;i++){
                if(number%i==0) count++;
            }
            int[] Factors = new int[count];
            int index =0;
            for(int i =1;i<=number;i++){
                if(number%i==0) {
                    Factors[index] =i;
                    index++;
            }
      }
      return Factors;
    }
    public static int sumfactors(int[] Factors){
        int sum =0;
        for(int factor:Factors){
            sum +=factor;
        }
        return sum;
    }
    public static int productoffactors(int[] Factors){
        int product =1;
        for(int factor:Factors){
            product*=factor;
        }
        return product;
    }
    public static double SumofSquares(int[] Factors){
        double SumofSquares =0;
        for(int factor:Factors){
            SumofSquares+=Math.pow(factor,2);
        }
        return SumofSquares;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
    }
}
