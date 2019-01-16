import java.util.Arrays;

public class findUnsortedSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int findUnsortedSubarray(int[] nums) {
		int shortestLength = Integer.MAX_VALUE;
		
		// Check all possible subarrays
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int[] subarray = Arrays.copyOfRange(nums, i, j);
				
				Arrays.sort(nums,i, j);
				// code goes here
				
			}
		}
		
		return shortestLength;
	}
}
