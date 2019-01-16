
public class floodFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] testImage = { {1,1,1}, {1,1,0}, {1,0,1} };
		
		testImage = floodFill(testImage, 1, 1, 1);
		
		int test = 0;
	}
	
	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
//		if (image[sr][sc] == newColor) {
//			return image;
//		}
		
		int ogColor = image[sr][sc];
		ffRecurse(image, sr, sc, newColor, ogColor);
		return image;
	}
	
	public static void ffRecurse(int[][] image, int sr, int sc, int newColor, int ogColor) {
		if ((sr < 0 || sr >= image.length || sc < 0 || sc >= image[sr].length) || (image[sr][sc] != ogColor)) {
			return;
		}
		
		image[sr][sc] = newColor;
		
		ffRecurse(image, sr + 1, sc, newColor, ogColor);
		ffRecurse(image, sr - 1, sc, newColor, ogColor);
		ffRecurse(image, sr, sc + 1, newColor, ogColor);
		ffRecurse(image, sr, sc - 1, newColor, ogColor);
	}
	
}
