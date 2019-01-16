
public class getMinimumDifference {	
	static int smallest = Integer.MAX_VALUE;
	static TreeNode prev = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static int getMinimumDifference(TreeNode root) {
		recurse(root);
		return smallest;
	}
	
	public static void recurse(TreeNode root) {
		if (root == null) {
			return;
		}
		
		recurse(root.left);
		
		if (prev != null && Math.abs(prev.val - root.val) < smallest) {
			smallest = Math.abs(prev.val - root.val);
		}
		
		prev = root;
		
		recurse(root.right);
	}
}
