import java.util.*;

public class letterCasePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "a1b2";
		letterCasePermutation(test);
	}
	
    public static List<String> letterCasePermutation(String S) {
    	List<String> answer = new ArrayList<>();
    	
    	if (S == null || S.length() == 0) {
    		answer.add("");
    		return answer;
    	}
    	
    	answer.add(S);
    	createVariants(S, answer, 0);
    	
    	return answer;
    }	
    
    public static void createVariants(String word, List<String> list, int index) {
    	if (index > word.length() - 1) {
    		return;
    	}
    	
    	if (Character.isLetter(word.charAt(index))) {    		
    		char letter = word.charAt(index);
    		letter = Character.isUpperCase(letter) ? Character.toLowerCase(letter) : Character.toUpperCase(letter);
    		String variantWord = word.substring(0, index) + letter + word.substring(index + 1);
    		    		
    		//list.add(word);
    		list.add(variantWord);
    		
    		createVariants(word, list, index + 1);
    		createVariants(variantWord, list, index + 1);
    	} else {
    		createVariants(word, list, index + 1);
    	}
    }
}
