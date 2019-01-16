import java.util.*;

public class fairCandySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] fairCandySwap(int[] A, int[] B) {		
		int aliceAnswer = 0;
		int bobAnswer = 0;
		Set<Integer> bobSet = new HashSet<>();
		
		for (int bar : A) { 
			aliceAnswer += bar;
		}
		
		for (int bar : B) { 
			bobAnswer += bar;
			bobSet.add(bar);
		}
		
		int target = (aliceAnswer + bobAnswer) / 2;
		
		for (int bar : A) {
			if (bobSet.contains(target - (aliceAnswer - bar))) {
				return new int[] { bar, target - (aliceAnswer - bar) };
			}
		}
		
		return null;
	}
}
