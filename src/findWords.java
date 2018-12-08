import java.util.*;
import java.util.stream.*;

public class findWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test = { "Hello","Alaska","Dad","Peace" };
		findWords(test);
		int i = -1;
	}
	
	public static String[] findWords(String[] words) {		
		Set<Character> s1 = Stream.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p').collect(Collectors.toSet());		
		Set<Character> s2 = Stream.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l').collect(Collectors.toSet());		
		Set<Character> s3 = Stream.of('z', 'x', 'c', 'v', 'b', 'n', 'm').collect(Collectors.toSet());
		
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < words.length; i++) {
			if (isMatch(words[i], s1) || (isMatch(words[i], s2)) || (isMatch(words[i], s3))) {
				list.add(words[i]);
			}
		}
		
		String[] answer = list.toArray(new String[0]);
		
		return answer;
	}
	
	public static boolean isMatch(String word, Set<Character> set) {
		for (int i = 0; i < word.length(); i++) {
			if (!set.contains(Character.toLowerCase(word.charAt(i)))) {
				return false;
			}
		}
		
		return true;
	}
}
