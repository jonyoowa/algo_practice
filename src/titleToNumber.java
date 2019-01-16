
public class titleToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static int titleToNumber(String s) {
		int answer = 0;
		
		for (int i = 0; i < s.length(); i++) {
			answer = answer * 26 + s.charAt(i) - 'A' + 1;
		}
		
		return answer;
	}
}
