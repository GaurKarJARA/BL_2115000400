public class FirstNegativeNum {
public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,-1,-2};
        System.out.println("Index of first negative number: " + helper(arr));
    }
    public static int helper(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }
} 