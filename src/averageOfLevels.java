import java.util.*;

public class averageOfLevels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tn1 = new TreeNode(2147483647);
		TreeNode tn2 = new TreeNode(2147483647);
		TreeNode tn3 = new TreeNode(2147483647);
		
		tn1.left = tn2;
		tn1.right = tn3;
		
		List<Double> list = averageOfLevels(tn1);
		
		System.out.println(list);
	}

    public static List<Double> averageOfLevels(TreeNode root) {
    	// Create map to store: { Level, { List of values @ Level }}
    	Map<Integer, List<Integer>> map = new TreeMap<>();
    	
    	// Populate map
    	traverseTree(root, 1, map);
    	
    	// Create list from map data and calculations
    	List<Double> answer = new ArrayList<>();
    	
    	for (int level : map.keySet()) {
    		double sum = 0;
    		List<Integer> list = map.get(level);
    		
    		for (int val : list) {
    			sum += val;
    		}
    			
    		double avg_val =  sum / list.size();
    		answer.add(avg_val);
    	}
    	
    	return answer;
    }
    
    public static void traverseTree(TreeNode node, int level, Map<Integer, List<Integer>> map) {
    	if (node == null) {
    		return;
    	}
    	
    	//
    	if (!map.containsKey(level)) {
    		List<Integer> list = new ArrayList();
    		list.add(node.val);
    		map.put(level, list);
    	} else {
    		List<Integer> list = map.get(level);
    		list.add(node.val);
    		map.replace(level, list);
    	}
    	
    	//
    	traverseTree(node.left, level + 1, map);
    	traverseTree(node.right, level + 1, map);
    }
}
