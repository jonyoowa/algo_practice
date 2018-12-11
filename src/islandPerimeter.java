
public class islandPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
		
	public static int islandPerimeter(int[][] grid) {
		int perimeter = 0;
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					// Check top
					perimeter += (i + 1 >= grid.length || grid[i + 1][j] == 0) ? 1 : 0;
					
					// Check bottom
					perimeter += (i - 1 < 0 || grid[i - 1][j] == 0) ? 1 : 0;
					
					// Check right
					perimeter += (j + 1 >= grid[i].length || grid[i][j + 1] == 0) ? 1 : 0;
					
					// Check left
					perimeter += (j - 1 < 0 || grid[i][j - 1] == 0) ? 1 : 0;
				}
			}
		}
		
		return perimeter;
	}
}
