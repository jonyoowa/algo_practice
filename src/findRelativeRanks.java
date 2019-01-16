import java.util.*;

public class findRelativeRanks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String[] findRelativeRanks(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		String[] answer = new String[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		
	    Arrays.sort(nums);
	    
	    answer[map.get(nums[nums.length - 1])] = "Gold Medal";
	    
	    if (nums.length > 1) {
	    	answer[map.get(nums[nums.length - 2])] = "Silver Medal";
	    }
	    
	    if (nums.length > 2) {
	    	answer[map.get(nums[nums.length - 3])] = "Bronze Medal";
	    }
	    
	    for (int i = nums.length - 4; i >= 0; i--) {
	    	answer[map.get(nums[i])] = String.valueOf(nums.length - i);
	    }
		
		return answer;
	}
}
