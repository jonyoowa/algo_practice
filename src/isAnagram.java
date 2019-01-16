import java.util.*;

public class isAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isAnagram("a", "ab");
	}
	
	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}		
		
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		
		for (int i = 0; i < t.length(); i++) {
			if (map.containsKey(t.charAt(i))) {
				map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
			}
		}
		
		for (char c : map.keySet()) {
			if (map.get(c) != 0) {
				return false;
			}
		}
		
		return true; 
	}

}
