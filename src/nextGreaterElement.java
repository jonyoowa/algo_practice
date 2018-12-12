import java.util.*;

public class nextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] answer = new int[nums1.length];
		
		Map<Integer, Integer> value_and_index = new HashMap<>();
		
		for (int i = 0; i < nums2.length; i++) {
			value_and_index.put(nums2[i], i);
		}
		
		for (int i = 0; i < nums1.length; i++) {
			int index = value_and_index.get(nums1[i]);
			
			int element = -1;
			for (int j = index + 1; j < nums2.length; j++) {
				if (nums2[j] > nums2[index]) {
					element = nums2[j];
					break;
				}
			}
			
			answer[i] = element;
		}
		
		return answer;
	}
}
