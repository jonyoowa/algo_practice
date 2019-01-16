import java.util.*;

public class findLUSlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = findLUSlength("abcd", "xybcz");
		
		System.out.println(test);
		
		int end = 0;
	}
	
	public static int findLUSlength(String a, String b) {		
		Set<String> a_set = getSequences(a);
		Set<String> b_set = getSequences(b);

		if (a.equals(b)) {
			return -1;
		} else {
			return Math.max(a.length(), b.length());
		}
//		Set<String> a_holder = a_set;
//		
//		for (String seq : a_set) {
//			if (b_set.contains(seq)) {
//				a_set.remove(seq);
//			}
//		}
//		
//		for (String seq : b_set) {
//			if (a_holder.contains(seq)) {
//				b_set.remove(seq);
//			}
//		}		
//		
//		int a_max = -1;
//		int b_max = -1;
//		
//		for (String seq : a_set) {
//			if (seq.length() > a_max) {
//				a_max = seq.length();
//			}
//		}
//		
//		for (String seq : b_set) {
//			if (seq.length() > b_max) {
//				b_max = seq.length();
//			}
//		}		
//		
//		return Math.max(a_max, b_max);
		
//		if (a_set.removeAll(b_set)) {
//			return a_set.size();
//		} else {
//			return -1;
//		}
	}
	
	public static Set<String> getSequences(String s) {
		if (s == null || s.isEmpty()) {
			return null;
		}
		
		Set<String> result = new HashSet<>();
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; i + j <= s.length(); j++) {
				String sequence = s.substring(i, i + j);
				result.add(sequence);
			}
		}
		
		return result;
	}
}
