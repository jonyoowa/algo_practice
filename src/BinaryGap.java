
public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int binaryGap(int N) {
		int answer = 0;
		int count = 0;
		
		while (N >= 1) {
			if ((N % 2 == 1 && count == 0) || (N % 2 == 0 && count > 0)) {
				count++;
			} else if (count > 0) {
				answer = Math.max(answer, count);
			}
			
			N /= 2;
		}
		
		return answer;
	}

}
