import java.util.*;

public class findTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode five = new TreeNode(5);
		TreeNode three = new TreeNode(3);
		TreeNode six = new TreeNode(6);
		TreeNode two = new TreeNode(2);
		TreeNode four = new TreeNode(4);
		TreeNode seven = new TreeNode(7);
		
		five.left = three;
		five.right = six;
		
		three.left = two;
		three.right = four;
		
		six.right = seven;
		
		findTarget(five, 9);
	}
	
	public static boolean findTarget(TreeNode root, int k) {
		if (root == null) {
			return false;
		}
		
		HashSet<Integer> set = new HashSet<>();
		return findTarget(root, k, set);
	}
	
	public static boolean findTarget(TreeNode root, int k, Set<Integer> set) {
		if (root == null) {
			return false;
		}
		
		if (set.contains(root.val)) {
			return true;
		}
		
		set.add(k - root.val);
		
		return findTarget(root.left, k, set) || findTarget(root.right, k, set);
	}
}
