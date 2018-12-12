
public class matrixReshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		if (r * c != nums[0].length * nums.length) {
			return nums;
		}
		
		int[][] answer = new int[r][c];
		for (int i = 0; i < r * c; i++) {
			answer[i / c][i % c] = nums[i / nums[0].length][i % nums[0].length];
		}
		
		return answer;
	}

}
