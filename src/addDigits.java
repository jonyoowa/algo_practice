import java.util.*;

public class addDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int addDigits(int num) {
		if (num <= 0) {
			return num;
		} 
		
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		if (sum >= 10) {
			return addDigits(sum);
		} else {
			return sum;
		} 
	}
}
