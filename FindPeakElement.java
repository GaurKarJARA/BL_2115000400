public class FindPeakElement {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println(helper(arr));
	}
	public static int helper(int[] arr) {
		int left = 0, right = arr.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] > arr[mid + 1]) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}
}
