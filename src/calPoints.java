import java.util.LinkedList;

public class calPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test = {"5","2","C","D","+"};
		System.out.println(calPoints(test));
	}
	
	public static int calPoints(String[] ops) {
		int sum = 0;
		LinkedList<Integer> answer = new LinkedList<>();
		
		for(int i = 0; i < ops.length; i++) {
			String curr = ops[i];
			switch(curr) {
				case "C": {
					sum -= answer.removeLast();
					break;
				}
				case "D": {
					sum += answer.getLast() * 2;
					answer.addLast(answer.getLast() * 2);
					break;
				}
				case "+": {
					int first = answer.removeLast();
					int second = answer.getLast();
					answer.addLast(first);
					sum += (first + second);
					answer.addLast(first + second);
					break;
				}
				default: {
					sum += Integer.parseInt(curr);
					answer.addLast(Integer.parseInt(curr));
					break;
				}
			}
		}
		
		return sum;
	}

}
