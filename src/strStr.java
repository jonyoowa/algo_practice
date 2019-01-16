
public class strStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "hello";
		String needle = "ll";
		strStr(haystack, needle);
	}
	
	public static int strStr(String haystack, String needle) {
		if (needle.length() == 0 || needle.equals("")) {
			return 0;
		} else if (needle.length() > haystack.length()) {
			return -1;
		}
		
		int len = needle.length();
		
		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			String s = haystack.substring(i, i + len);
			if (needle.equals(s)) {
				return i;
			}
		}
		
		return -1;
	}

}
