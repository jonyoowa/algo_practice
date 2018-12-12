
public class maxDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxDepth(TreeNode root) {
		return recurse(root, 0);
	}
	
	public static int recurse(TreeNode node, int depth) {
		if (node == null) {
			return depth;
		}
				
		int left = recurse(node.left, depth + 1);
		int right = recurse(node.right, depth + 1);
		
		return Math.max(left, right);		
	}
}
