import java.util.*;

public class findRestaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String[] findRestaurant(String[] list1, String[] list2) {
		Set<String> set1 = new HashSet<String>(Arrays.asList(list1));
		Set<String> set2 = new HashSet<String>(Arrays.asList(list2));
		
		set1.retainAll(set2);
		
		Map<String, Integer> map = new HashMap<>();
		
		for (String word : set1) {
			int index1 = 0;
			while (!word.equals(list1[index1])) {
				index1++;
			}
			
			int index2 = 0;
			while (!word.equals(list2[index2])) {
				index2++;
			}
			
			map.put(word, index1 + index2);
		}
		
		int min = Integer.MAX_VALUE;
		for (Map.Entry<String, Integer> pair : map.entrySet()) {
			if (pair.getValue() < min) {
				min = pair.getValue();
			}
		}
		
		List<String> ans = new ArrayList<>();
		for (Map.Entry<String, Integer> pair : map.entrySet()) {
			if (pair.getValue() == min) {
				ans.add(pair.getKey());
			}
		}
		
		return ans.toArray(new String[0]);
	}

}
