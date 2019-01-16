
public class maxCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
		
	public static int maxCount(int m, int n, int[][] ops) {
		if (ops == null || ops.length == 0) {
			return m * n;
		}
		
		int row = Integer.MAX_VALUE;
		int column = Integer.MAX_VALUE;
		
		for (int[] op : ops) {
			row = Math.min(row, op[0]);
			column = Math.min(column, op[1]);
		}
		
		return row * column;
	}
}
