package StringProblems;
import java.util.Scanner;

public class VowelsAndConso {
   public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter string:");
        String str = sc.nextLine();
        int[] result  = Count(str);
        System.out.println("number of vowels: "+result[0]);
        System.out.println("number of consonants: "+result[1]);
   }
   public static int[] Count(String str){      
       int vowels= 0;  int consonants =0;
       String vowelsAlphabet = "aeiouAEIOU";
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                if(vowelsAlphabet.indexOf(str.charAt(i)) !=-1){
                    vowels++;
                }
                else consonants++;
            }
        }
      return new int[]{vowels,consonants};
    }

}