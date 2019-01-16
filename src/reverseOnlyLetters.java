
public class reverseOnlyLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "E1ite-HAx0R";
		String test = reverseOnlyLetters(s);
	}
	
	public static String reverseOnlyLetters(String S) {
		char[] c = S.toCharArray();
        int l = 0;
		int r = S.length() - 1;
		
        while (l < r) {
            while (l < r && !Character.isLetter(c[l])) {
            	l++;
            }
            
            while (l < r && !Character.isLetter(c[r])) {
            	r--;
            }
            
            if (l < r) {
                char temp = c[l];
                c[l] = c[r];
                c[r] = temp;
                l++;
                r--;
            }
        }
        
        return new String(c);
	}

}
