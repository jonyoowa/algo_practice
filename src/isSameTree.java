
public class isSameTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if (p != null && q != null && p.val == q.val) {
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		} else if (p == null && q == null) {
			return true;
		} else {
			return false;
		}
	}
}
