
public class moveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] test = { 0, 1, 0, 0, 0, 0, 3, 12 };
		//int[] test = { 1, 0 };
		int[] test = { 1, 0, 1};
		moveZeroes(test);
		
		System.out.println(test);
	}
	
//	public static void moveZeroes(int[] nums) {
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] == 0) {
//				int index = i;
//				while (index < nums.length && nums[index] == 0) {
//					index++;
//				}
//				
//				if (index < nums.length) {
//					int temp = nums[i];
//					nums[i] = nums[index];
//					nums[index] = temp;
//				}
//			}
//		}
//	}
	
	public static void moveZeroes(int[] nums) {
		int z = 0;
		int n = 0;
		
		while (z < nums.length && n < nums.length) {			
			while (z < nums.length && nums[z] != 0) {
				z++;
			}
			
			while (n < nums.length && nums[n] == 0) {
				n++;
			}
			
			if (n < nums.length && z < nums.length && z < n) {
				// swap
				int temp = nums[z];
				nums[z] = nums[n];
				nums[n] = temp;	
			}
			
			n++;
		}
	}
}
