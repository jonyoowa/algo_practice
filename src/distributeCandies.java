import java.util.*;

public class distributeCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int distributeCandies(int[] candies) {		
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < candies.length; i++) {
			set.add(candies[i]);
		}
		
		return Math.min(candies.length / 2, set.size());
	}

}
