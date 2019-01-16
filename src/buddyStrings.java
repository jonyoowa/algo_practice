import java.util.*;
import java.util.Map.Entry;

public class buddyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "ab";
		String B = "ba";
		
		boolean test = buddyStrings(A, B);
		boolean test2 = buddyStrings(A, A);
		boolean test3 = buddyStrings("abc", "xyz");
		int x;
	}
	
	public static boolean buddyStrings(String A, String B) {
		if (A.length() != B.length()) {
			return false;
		} 
		
		int len = A.length();		
		int diff = 0;
		int[] pairIndices = new int[2];
		
		for (int i = 0; i < len; i++) {
			if (A.charAt(i) != B.charAt(i)) {
				if (diff == 0) {
					pairIndices[0] = i;
				} else if (diff == 1) {
					pairIndices[1] = i;
				} else {
					return false;
				}
				
				diff++;
			}
		}
		
		if (diff > 2 || diff == 1) {
			return false;
		} 
		
		if (diff == 0) {
			return duplicateExists(A);
		}
		
		if (diff == 2) {
			if (A.charAt(pairIndices[0]) != B.charAt(pairIndices[1])) {
				return false;
			} 
			
			if (A.charAt(pairIndices[1]) != B.charAt(pairIndices[0])) {
				return false;
			} 
		}
		
		return true;
	}
	
	public static boolean duplicateExists(String A) {
		Set<Character> set = new HashSet<>();
		
		for (int i = 0; i < A.length(); i++) {
			if (set.contains(A.charAt(i))) {
				return true;
			} else {
				set.add(A.charAt(i));
			}
		}
		
		return false;
	}
}
