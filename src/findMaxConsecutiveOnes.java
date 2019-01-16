
public class findMaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int findMaxConsecutiveOnes(int[] nums) {
		int currCounter = 0;
		int maxOnes = 0;
        
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				currCounter++;
				if (currCounter > maxOnes) {
					maxOnes = currCounter;
				}
			} else {
				currCounter = 0;
			}
		}
		
		return maxOnes;
	}
}
