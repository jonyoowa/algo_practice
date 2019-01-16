
public class largestTriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static double largestTriangleArea(int[][] points) {
		double answer = 0;
		
		for (int[] i : points) {
			for (int[] j : points) {
				for (int[] k : points) {
					answer = Math.max(answer, 0.5 * Math.abs(i[0] * j[1] + j[0] * k[1] + k[0] * i[1]- j[0] * i[1] - k[0] * j[1] - i[0] * k[1]));
				}
			}
		}
		
		return answer;
	}
}
