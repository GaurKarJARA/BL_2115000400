package StringProblems;

public class Palindrome {
    public static void main(String[] args) {
        String str1 = "Level";
        String str2 = "madam";
        System.out.println();

    }
    public static boolean PalindromeCheck(String string){
        int left  =0; int right  =string.length()-1;
        while(left<right){
            if(string.charAt(left) != string.charAt(right)){
                return false; 
            }
        left++;
        right--;
        }
        return true;
    }
}
