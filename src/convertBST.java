import java.util.*;

public class convertBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode five = new TreeNode(5);
		TreeNode two = new TreeNode(2);
		TreeNode thirteen = new TreeNode(13);
		
		five.left = two;
		five.right = thirteen;
		
		//
		convertBST(five);
	}
	
	public static TreeNode convertBST(TreeNode root) {
		if (root == null) {
			return null;
		}
		
		Stack<Integer> stack = new Stack<>();
		
		fillStack(root, stack);
		convertToGreaterTree(root, stack);
		
		return root;
	}
	
	public static void fillStack(TreeNode node, Stack<Integer> stack) {
		if (node == null) {
			return;
		}
		
		fillStack(node.right, stack);
		
		if (stack.empty()) {
			stack.push(node.val);
		} else {
			stack.push(node.val + stack.peek());
		}
		
		fillStack(node.left, stack);
	}
	
	public static void convertToGreaterTree(TreeNode node, Stack<Integer> stack) {
		if (node == null) {
			return;
		}
		
		convertToGreaterTree(node.left, stack);
		node.val = stack.pop();
		convertToGreaterTree(node.right, stack);
	}
}
