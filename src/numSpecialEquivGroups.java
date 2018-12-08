import java.util.*;

public class numSpecialEquivGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test = { "a","b","c","a","c","c" };
		
		System.out.println(numSpecialEquivGroups(test));
	}
	
	public static int numSpecialEquivGroups(String[] A) {
		Set<String> group_set = new HashSet<>();
		
		for (String element : A) {
			group_set.add(findSpecialEquiv(element));
		}
		
		return group_set.size();
	}
	
	public static String findSpecialEquiv(String element) {
        char[] odd = new char[element.length() / 2];
        char[] even = new char[(element.length() + 1) / 2];
		
		for (int i = 0, o = 0, e = 0; i < element.length(); i++) {
			if (i % 2 == 0) { 
				even[e++] = element.charAt(i); 
			} else { 
				odd[o++] = element.charAt(i); 
			}				
		}
		
        Arrays.sort(odd);
        Arrays.sort(even);
        
        StringBuilder sb = new StringBuilder();
		for (int i = 0, o = 0, e = 0; i < element.length(); i++) {
			if (i % 2 == 0) { 
				sb.append(even[e++]); 
			} else { 
				sb.append(odd[o++]); 
			}				
		}

		return sb.toString();
	}

}
