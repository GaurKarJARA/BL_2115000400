import java.util.*;
class TwoSum {
    public static int[] findTwoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 5;
        int[] result = findTwoSum(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
