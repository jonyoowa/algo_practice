
public class countPrimeSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int countPrimeSetBits(int L, int R) {
		int count = 0;
		
		for (int i = L; i <= R; i++) {
			int bitCount = Integer.bitCount(i);
			if (isPrime(bitCount)) {
				count++;
			}
		}
		
		return count;
	}
	
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
