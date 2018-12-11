
public class increasingBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public TreeNode increasingBST(TreeNode root) {
        return increasingBST(root, null);
    }

    public TreeNode increasingBST(TreeNode root, TreeNode tail) {
        if (root == null) {
        	return tail;
        }
        
        TreeNode result = increasingBST(root.left, root);
        root.left = null;
        root.right = increasingBST(root.right, tail);
        return result;
    }
}
