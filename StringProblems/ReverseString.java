package StringProblems;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello this is me";
        System.out.println("the reversed string is: "+Reverse(str));
    }
    public static String Reverse(String string){
        String result = "";
        for(int i=string.length()-1; i>=0;i--){
            result+=string.charAt(i);
        }
        return result;
    }
}
