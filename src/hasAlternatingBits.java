
public class hasAlternatingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean hasAlternatingBits(int n) {
		String s = Integer.toBinaryString(n);
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				return false;
			}
		}
		
		return true;
	}

}
