import java.util.*;

public class largeGroupPositions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static List<List<Integer>> largeGroupPositions(String S) {
		List<List<Integer>> answer = new ArrayList<>();
		
		int index = 0;
		
		while (index < S.length()) {
			int len = 0;
			while (index + len < S.length() && S.charAt(index) == S.charAt(index + len)) {
				len++;
			}
			
			if (len >= 3) {
				answer.add(Arrays.asList(index, index + len - 1));
			}
			
			index += len;
		}
		
		return answer;
	}

}
