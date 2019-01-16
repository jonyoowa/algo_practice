import java.util.*;

public class countPrimes {
	private static List<Integer> primes = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = 4;

		countPrimes(test);
	}
	
	public static int countPrimes(int n) {
		int count = 0;
		
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println(i);
				primes.add(i);
			}
		}
		
		return count;
	}
	
	public static boolean isPrime(int n) {
		if (n == 2) {
			return true;
		}
		
		if (n % 2 == 0) {
			return false; 
		}
		
		for (int prime : primes) {
			if (n % prime == 0) {
				return false;
			}
		}
		
		return true;
	}
}
