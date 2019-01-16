
public class detectCapitalUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean detectCapitalUse2(String word) {
		if (word == null || word.length() == 0) {
			return true;
		}
		
		if (Character.isLowerCase(word.charAt(0))) {
			for (int i = 1; i < word.length(); i++) {
				if (Character.isUpperCase(word.charAt(i))) {
					return false;
				}
			}
			
			return true;
		} else {
			boolean properNoun = false;
			
			for (int i = 1; i < word.length(); i++) {
				
			}
		}
		
		//
		return true;
	}
	
    public boolean detectCapitalUse(String word) {
    	return (allLower(word) || allUpper(word)) || properNoun(word);
    }
    
    public boolean allLower(String word) {
    	for (int i = 0; i < word.length(); i++) {
    		if (Character.isUpperCase(word.charAt(i))) {
    			return false;
    		}
    	}
    	
    	return true;
    }
    
    public boolean allUpper(String word) {
    	for (int i = 0; i < word.length(); i++) {
    		if (Character.isLowerCase(word.charAt(i))) {
    			return false;
    		}
    	}
    	
    	return true;
    }
    
    public boolean properNoun(String word) {
    	if (Character.isUpperCase(word.charAt(0))) {
        	for (int i = 1; i < word.length(); i++) {
        		if (Character.isUpperCase(word.charAt(i))) {
        			return false;
        		}
        	}
        	
        	return true;
    	} else {
    		return false;
    	}
    }
}
