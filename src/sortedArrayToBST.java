
public class sortedArrayToBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static TreeNode sortedArrayToBST(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		
		return sortedArrayToBST(nums, 0);
	}
	
	public static TreeNode sortedArrayToBST(int[] nums, int n) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		
		return null; 
	}

}
