
public class lemonadeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {5,5,5,10,20 };
		lemonadeChange(test);
	}
	
	public static boolean lemonadeChange(int[] bills) {
		int usdFive = 0;
		int usdTen = 0;
		
		for (int i = 0; i < bills.length; i++) {
			if (bills[i] == 5) {
				usdFive++;
			} else if (bills[i] == 10) {
				if (usdFive > 0) {
					usdFive--;
					usdTen++;
				} else {
					return false;
				}
			} else {
				if (usdTen > 0 && usdFive > 0) {
					usdTen--;
					usdFive--;
				} else if (usdFive > 2) {
					usdFive -= 3;
				} else {
					return false;
				}
			}
		}
		
		return true; 
	}
}
