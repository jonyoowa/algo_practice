import java.util.*;

public class levelOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n5 = new Node(5, null);
		Node n6 = new Node(6, null);
		
		List<Node> list3 = new ArrayList<>();
		list3.add(n5);
		list3.add(n6);
		
		Node n3 = new Node(3, list3);
		
		Node n2 = new Node(2, null);
		Node n4 = new Node(4, null);
		
		List<Node> list1 = new ArrayList<>();
		
		list1.add(n3);
		list1.add(n2);
		list1.add(n4);
		
		Node n1 = new Node(1, list1);
		
		List<List<Integer>> test = levelOrder(n1);
		System.out.println(test);
	}

    public static List<List<Integer>> levelOrder(Node root) {
    	List<List<Integer>> answer = new ArrayList<>();
    	recurse(root, answer, 0);
    	return answer;
    }
    
    public static void recurse(Node root, List<List<Integer>> list, int level) {
    	if (root == null) {
    		return;
    	}
    	
    	if (list.size() == level) {
    		list.add(new ArrayList<>());
    	}
    	
    	List<Integer> item = list.get(level);
    	item.add(root.val);
    	for (Node n : root.children) {
    		recurse(n, list, level + 1);
    	}
    }
}
