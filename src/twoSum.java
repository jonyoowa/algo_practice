import java.util.*;

public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = { 2, 7, 11, 15 };
		int[] x = twoSum(test, 10);
	}
	
//	public static int[] twoSum(int[] numbers, int target) {
//		int[] answer = new int[2];
//		
//		for (int i = 0; i < numbers.length - 1; i++) {
//			for (int j = i + 1; j < numbers.length; j++) {
//				if (numbers[i] + numbers[j] == target) {
//					answer[0] = i + 1;
//					answer[1] = j + 1;
//					return answer;
//				}
//			}
//		}
//		
//		return answer;
//	}
	
//	public static int[] twoSum(int[] numbers, int target) {
//		int[] answer = new int[2];
//		
//		for (int i = 0; i < numbers.length - 1; i++) {
//			int diff = target - numbers[i]; 
//			for (int j = i + 1; j < numbers.length; j++) {
//				if (numbers[j] == diff) {
//					answer[0] = i + 1;
//					answer[1] = j + 1;
//					return answer;
//				} else if (numbers[j] > diff) {
//					break;
//				}
//			}
//		}
//		
//		return answer;
//	}
	
	public static int[] twoSum(int[] nums, int target) {
	    int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < nums.length; i++) {
	        if (map.containsKey(target - nums[i])) {
	            result[1] = i;
	            result[0] = map.get(target - nums[i]) - 1;
	            return result;
	        }
	        map.put(nums[i], i + 1);
	    }
	    
	    return result;
	}
}
