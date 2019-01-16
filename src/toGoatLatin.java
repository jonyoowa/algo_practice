import java.util.*;

public class toGoatLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String toGoatLatin(String S) {
		Set<Character> vowelSet = createVowelSet();
		String[] words = S.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			String w = words[i];
			
			if (vowelSet.contains(w.charAt(0))) {
				w = w + "ma";
			} else {
				char initial = w.charAt(0);
				w = w.substring(1) + initial + "ma";
			}
			
			for (int endA = i + 1; endA > 0; endA--) {
				w += "a";
			}
			
		}
		
		return String.join(" ", words);
	}
	
	public static Set<Character> createVowelSet() {
		Set<Character> vowels = new HashSet<>();
		
		vowels.add('a');
		vowels.add('A');
		vowels.add('e');
		vowels.add('E');
		vowels.add('i');
		vowels.add('I');
		vowels.add('o');
		vowels.add('O');
		vowels.add('u');
		vowels.add('U');
		
		return vowels; 
	}
}
