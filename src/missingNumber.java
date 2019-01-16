
public class missingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 5, 1, 2, 4, 0 };
		int ans = missingNumber(array);
	}
	
	public static int missingNumber(int[] nums) {
		int sum = 0;
		
		for (int i = 0; i < nums.length + 1; i++) {
			sum += i;
		}
		
		for (int i = 0; i < nums.length; i++) {
			sum -= nums[i];
		}
		
		return sum;
	}

}
