import java.util.*;

public class findTheDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static char findTheDifference(String s, String t) {
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, 1 + map.get(c));
			} else {
				map.put(c, 1);
			}
		}
		
		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			if (map.get(c) != null) {
				map.put(c, map.get(c) - 1);
				if (map.get(c) < 0) {
					return c;
				}
			}
		}
		
		return t.charAt(t.length() - 1);
	}
}
