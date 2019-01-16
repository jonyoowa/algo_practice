import java.util.*;

public class countBinarySubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "00110011";
		int test = countBinarySubstrings(s);
		System.out.println(test);
	}
	
	public static int countBinarySubstrings(String s) {
		int count = 0;
		
		// Create parts, convert to array from list
		List<String> parts = new ArrayList<>();
		
		for (int i = 0; i < s.length(); i++) {
			char digit = s.charAt(i);
			int j = i;
			StringBuilder sb = new StringBuilder();
			while (j < s.length() && s.charAt(j) == digit) {
				sb.append(digit);
				j++;
			}
			
			parts.add(sb.toString());
			i = (j - 1);
		}
		
		String[] sArray = parts.stream().toArray(String[]::new);
		
		// find min of pairs
		for (int i = 0; i < sArray.length - 1; i++) {
			count += Math.min(sArray[i].length(), sArray[i + 1].length());
		}
		
		return count;
	}
}
