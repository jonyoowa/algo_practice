import java.util.*;

public class majorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
				
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		
		return Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
	}
}
