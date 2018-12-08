
public class isToeplitzMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[][] {
		          { 1,2,3,4 },
		          { 5,1,2,3 },
		          { 9,5,1,2 }
		};
		
		boolean ans = isToeplitzMatrix(matrix);
		
		int x = 0;
	}
	
    public static boolean isToeplitzMatrix(int[][] matrix) {  
    	int row_size = matrix.length;
    	int column_size = matrix[0].length;
    	
    	// Going up
        for (int i = matrix.length - 2; i >= 0; i--) {
        	
        	int value = matrix[i][0];
        	
        	for (int column = 1, row = i + 1; row < matrix.length && column < matrix[i].length; column++, row++) {
        		if (matrix[row][column] != value) {
        			return false;
        		}
        	}
        	
        }
        
        // Going right
        for (int i = 1; i < matrix[0].length - 1; i++) {
        	
        	int value = matrix[0][i];
        	
        	for (int column = i + 1, row = 1; row < matrix.length && column < matrix[0].length; column++, row++) {
        		if (matrix[row][column] != value) {
        			return false;
        		}
        	}
        	
        }
        
    	return true;
    }

}
