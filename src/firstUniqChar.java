import java.util.*;

public class firstUniqChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int firstUniqChar(String s) {
		Map<Character, Integer> letters = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			if (letters.containsKey(s.charAt(i))) {
				letters.put(s.charAt(i), 1 + letters.get(s.charAt(i)));
			} else {
				letters.put(s.charAt(i), 1);
			}
		}
		
		for (int i = 0; i < s.length(); i++) {
			if (letters.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		
		return -1;
	}
}
