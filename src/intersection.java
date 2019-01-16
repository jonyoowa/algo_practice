import java.util.*;

public class intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();		
		
        for (int i = 0; i < nums1.length; i++) {
        	if (!set.contains(nums1[i])) {
        		set.add(nums1[i]);
        	}
        }
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < nums2.length; i++) {
        	if (set.remove(nums2[i])) {
        		list.add(nums2[i]);
        	}
        }
        
		int[] answer = null;
		return answer;
	}
}
