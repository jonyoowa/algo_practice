
public class reverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int reverse(int x) {
		int ans = 0;
		
		while (x != 0) {
			int end = x % 10;
			int newAns = ans * 10 + end;
			
			if ((newAns - end) / 10 != ans) { return 0; }
			
			ans = newAns;
			x /= 10;
		}
		
		return ans;
	}

}
