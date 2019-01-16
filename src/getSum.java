
public class getSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int getSum(int a, int b) {
		int carry = a & b;
		int result = a ^ b;
		
		while (carry != 0) {
			int shiftedCarray = carry << 1;
			carry = result & shiftedCarray;
			result ^= shiftedCarray;
		}
		
		return result;
	}

}
