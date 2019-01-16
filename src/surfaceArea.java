import java.util.*;
import java.util.stream.*;

public class surfaceArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] test = { {1,1,1}, {1,0,1}, {1,1,1} };
		//int[][] test = { { 2 } };
		
		int result = surfaceArea(test);
		
		System.out.println(result);
	}
	
	public static int surfaceArea(int[][] grid) {
		int sum = 0;
		int length = grid.length;
		
		for (int r = 0; r < length; r++) {
			for (int c = 0; c < length; c++) {
				if (grid[r][c] != 0) {
					sum += (2 + 4 * grid[r][c]);
					
					// If not top
					if (r > 0 && grid[r - 1][c] != 0) {
						sum -= 2 * Math.min(grid[r][c], grid[r - 1][c]);
					}
					
					// If not left
					if (c > 0 && grid[r ][c - 1] != 0) {
						sum -= 2 * Math.min(grid[r][c], grid[r][c - 1]);
					}
				}
			}
		}
		
		return sum;
	}
	
//	public static int surfaceArea(int[][] grid) {
//		int sum = 0;
//		int length = grid.length;
//		
//		// Top Bottom
//		int top_bottom = 0;
//		
//		for (int i = 0; i < length; i++) {
//			for (int j = 0; j < length; j++) {
//				if (grid[i][j] != 0) {
//					top_bottom += 2;
//				} else {
//					//up
//					if (grid[i + 1][j] != 0) {
//						sum += 1;
//					}
//					
//					//right
//					
//					//down
//					
//					//left
//				}
//			}
//		}
//		
//		// North South
//		int[] c_values = new int[length];
//		int c_index = 0;
//		
//		while (c_index < length) {
//			c_values[c_index] = grid[c_index][0];
//			
//			for (int i = 1; i < length; i++) {
//				if (grid[c_index][i] > c_values[c_index]) {
//					c_values[c_index] = grid[c_index][i];
//				}
//			}
//			
//			c_index++;
//		}
//		
//		// West East
//		int[] r_values = new int[length];
//		int r_index = 0;
//		
//		while (r_index < length) {
//			r_values[r_index] = grid[0][r_index];
//			
//			for (int i = 1; i < length; i++) {
//				if (grid[i][r_index] > r_values[r_index]) {
//					r_values[r_index] = grid[i][r_index];
//				}
//			}
//			
//			r_index++;
//		}
//		
//		//
//		int c_sum = 2 * IntStream.of(c_values).sum();
//		int r_sum = 2 * IntStream.of(r_values).sum();
//
//		return (c_sum + r_sum + top_bottom);
//	}
}
