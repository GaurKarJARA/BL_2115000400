 import java.util.*;
class SubarrayZeroSum {
  public static List<int[]> findZeroSumSubarrays(int[] nums) {
    List<int[]> result = new ArrayList<>();
    Map<Integer, List<Integer>> sumMap = new HashMap<>();
    int sum = 0;
    sumMap.put(0, new ArrayList<>());
    sumMap.get(0).add(-1);
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];

      if (sumMap.containsKey(sum)) {
        for (int start : sumMap.get(sum)) {
          result.add(new int[] {start + 1, i});
        }
      }
      sumMap.putIfAbsent(sum, new ArrayList<>());
      sumMap.get(sum).add(i);
    }
    return result;
  }

  public static void main(String[] args) {
    int[] nums = {5,3,5,96,3,-4,2,-7,3};
    List<int[]> result = findZeroSumSubarrays(nums);
    System.out.println("Zero Sum Subarrays (start index, end index):");
    for (int[] range : result) {
      System.out.println(Arrays.toString(range));
    }
  }
} 
