
public class sumOfLeftLeaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int sumOfLeftLeaves(TreeNode root) {
		if (root == null) {
			return 0;
		}
		
		int sum = 0;
		
		if (root.left != null) {
			if (root.left.left == null && root.left.right == null) {
				sum += root.left.val;
			} else {
				sum += sumOfLeftLeaves(root.left);
			}
		}
		
		sum += sumOfLeftLeaves(root.right);
		
		return sum;
	}

}
