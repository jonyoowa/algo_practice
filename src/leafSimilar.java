import java.util.*;

public class leafSimilar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>(); 
        List<Integer> list2 = new ArrayList<>(); 
        
    	return createLeafList(root1, list1).equals(createLeafList(root2, list2));
    }
    
    public List<Integer> createLeafList(TreeNode root, List<Integer> list) {
    	if (root == null) { return null; }
    	
    	if (root.left == null && root.right == null) {
    		list.add(root.val);
    	} else {
    		createLeafList(root.left, list);
    		createLeafList(root.right, list);
    	}
    	
    	return list;
    }
}
