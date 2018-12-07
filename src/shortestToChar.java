
public class shortestToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	String test = "loveleetcode";
    	char c = 'e';
		shortestToChar(test, c);
	}
	
    public static int[] shortestToChar(String S, char C) {
        int n = S.length();
        int pos = -1 * n;
        int[] answer = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == C) { pos = i; }
            answer[i] = i - pos;
        }
        
        for (int i = n - 1; i >= 0; i--) {
            if (S.charAt(i) == C)  { pos = i; }
            answer[i] = Math.min(answer[i], Math.abs(i - pos));
        }
        
        return answer;
    }
}
