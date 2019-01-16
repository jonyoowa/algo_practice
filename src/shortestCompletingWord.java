import java.util.*;

public class shortestCompletingWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String licensePlate = "1s3 456";
		String[] words =  { "looks","pest","stew","show" };
		String test = shortestCompletingWord(licensePlate, words);
		System.out.println(test);
	}
	
	public static String shortestCompletingWord(String licensePlate, String[] words) {
		// Create and populate map
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < licensePlate.length(); i++) {
			if (Character.isLetter(licensePlate.charAt(i))) {
				if (map.containsKey(Character.toLowerCase(licensePlate.charAt(i)))) {
					map.put(Character.toLowerCase(licensePlate.charAt(i)), 1 + map.get(Character.toLowerCase(licensePlate.charAt(i))));
				} else {
					map.put(Character.toLowerCase(Character.toLowerCase(licensePlate.charAt(i))), 1);
				}
			}
		}
		
		String answer = null;
		// 
		for (int i = 0; i < words.length; i++) {
			Map<Character, Integer> map2 = new HashMap<>(map);
			for (int j = 0; j < words[i].length(); j++) {
				if (answer == null || answer.length() > words[i].length()) {
					if (map2.containsKey(words[i].charAt(j))) {
						map2.put(words[i].charAt(j), map2.get(words[i].charAt(j)) - 1);
					}
				}
			}
			
			if (checkLetters(words[i], map2)) {
				answer = words[i];
			}
		}
		
		return answer; 
	}
	
	public static boolean checkLetters(String word, Map<Character, Integer> map) {
		for (Map.Entry<Character, Integer> pair : map.entrySet()) {
		    if (pair.getValue() == null || pair.getValue() > 0) {
		    	return false;
		    }
		}
		
		return true;
	}
}
