
public class singleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray = { 4, 1, 2, 1, 2 };
		int ans = singleNumber(testArray);
		System.out.println(ans);
	}
	
	public static int singleNumber(int[] nums) {
		int result = 0;
		
		for (int i = 0; i < nums.length; i++) {
			result ^= nums[i];
		}
		
		return result;
	}

}
