
public class quadTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static quadTreeNode construct(int[][] grid) {		
		return recurse(grid, grid.length, 0, 0);
	}
	
	public static quadTreeNode recurse(int[][] grid, int length, int x, int y) {
		if (length <= 0) {
			return null;
		}
		
		else if (length == 1) {
			boolean value = grid[x][y] == 1 ? true : false;
			return new quadTreeNode(value, true, null, null, null, null);
		}
		
		if (allSame(grid, x, y)) {
			
		}
		
		quadTreeNode topLeft = recurse(grid, length / 2, 0, 0);
		quadTreeNode topRight = recurse(grid, length / 2, length / 2, 0);
		quadTreeNode bottomLeft = recurse(grid, length / 2, 0, length / 2);
		quadTreeNode bottomRight = recurse(grid, length / 2, length / 2, length / 2);
		
		return new quadTreeNode(true, false, topLeft, topRight, bottomLeft, bottomRight);
	}
	
	public static boolean allSame(int[][] grid, int x, int y) {		
		for (int i = 0; x + i < grid.length; i++) {
			for (int j = 0; y + j < grid.length; j++) {
				if (grid[x][y] != grid[x + i][y + j]) {
					return false;
				}
			}
		}
		
		return true;
	}
}
