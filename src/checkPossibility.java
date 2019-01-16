
public class checkPossibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] example = { 4, 2, 3, 1, 5, 6, 1, 7};
	}
	
	public static boolean checkPossibility(int[] nums) {
		int count = 0;
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] > nums[i]) {
				count++;
				
				if (i < 2 || nums[i - 2] <= nums[i]) {
					nums[i - 1] = nums[i];
				} else {
					nums[i] = nums[i - 1];
				}
			
				if (count > 1) {
					return false;
				}
			}
		}
		
		return true;
	}
}
