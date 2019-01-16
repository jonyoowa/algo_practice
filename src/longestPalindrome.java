import java.util.*; 

public class longestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int longestPalindrome(String s) {
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1 + map.get(s.charAt(i)));
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		
		int answer = 0;
		boolean nonpair = false;
		
		for (Map.Entry<Character, Integer> pair : map.entrySet()) {
			if (!nonpair && pair.getValue() % 2 != 0) {
				nonpair = true;
			}
			
			answer += pair.getValue() / 2;
		}
		
		answer *= 2; 
		
		if (nonpair) {
			answer += 1;
		}
		
		return answer; 
	}

}
