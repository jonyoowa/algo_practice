import java.util.*;

public class findShortestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int findShortestSubArray(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], 1 + map.get(nums[i]));
			} else {
				map.put(nums[i], 1);
			}
		}
		
		int max = 0;
		
		for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
			if (pair.getValue() > max) {
				max = pair.getValue();
			}
		}
		
		Set<Integer> set = new HashSet<>();
		for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
			if (pair.getValue() == max) {
				set.add(pair.getKey());
			}
		}
		
		int answer = Integer.MAX_VALUE;
		
		for (int value : set) {
			int first = -1, last = -1;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == value) {
					if (first == -1) {
						first = i;
					} 
					
					last = i;
				}
			}
			
			int diff = last - first + 1;
			
			if (diff < answer) {
				answer = diff;
			}
		}
		
		return answer;
	}
}
