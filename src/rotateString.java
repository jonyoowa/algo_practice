import java.util.*;

public class rotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rotateString("", "");
	}
	
	public static boolean rotateString(String A, String B) {
		if (A.length() == 0 && B.length() == 0) {
			return true;
		} else if (A.length() != B.length()) {
			return false;
		}
		
		String variant = A;
		for (int i = 0; i < A.length(); i++) {
			if (variant.equals(B)) {
				return true;
			} else {
				variant = variant.substring(1) + variant.substring(0, 1);
			}
		}
		
		return false;
	}

}
