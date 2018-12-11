import java.util.*;

public class isAlienSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isAlienSorted(String[] words, String order) {
		if (words == null || words.length <= 1) {
			return true;
		}
		
		Map<Character, Integer> map = new HashMap<>();
		int index = 0;
		for (char letter : order.toCharArray()) {
			map.put(letter, index++);
		}
		
		for (int i = 0; i < words.length - 1; i++) {
			char[] curr = words[i].toCharArray();
			char[] next = words[i + 1].toCharArray();
			boolean flag = false;
			for (int j = 0; j < curr.length && j < next.length; j++) {
				if (map.get(curr[j]) < map.get(next[j])) {
					flag = true;
					break;
				} else if (map.get(curr[j]) != map.get(next[j])) {
					return false;
				}
			}
			
			if (curr.length > next.length && flag == false) {
				return false;
			}
		}
		
		return true;
	}
}
