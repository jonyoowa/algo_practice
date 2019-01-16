
public class invertTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn3 = new TreeNode(3);
		
		TreeNode tn2 = new TreeNode(2);
		tn2.left = tn1;
		tn2.right = tn3;
		
		TreeNode tn6 = new TreeNode(6);
		TreeNode tn9 = new TreeNode(9);
		
		TreeNode tn7 = new TreeNode(7);
		tn7.left = tn6;
		tn7.right = tn9;
		
		TreeNode tn4 = new TreeNode(4);
		tn4.left = tn2;
		tn4.right = tn7;
		
		TreeNode test = invertTree(tn4);
		
	}
	
    public static TreeNode invertTree(TreeNode root) {
    	if (root == null) {
    		return null;
    	}
    	
    	TreeNode temp = root.left;
    	root.left = invertTree(root.right);
    	root.right = invertTree(temp);
    	
    	return root;
    }
}
