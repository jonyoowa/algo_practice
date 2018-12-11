import java.util.*;

public class fizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<String> fizzBuzz(int n) {
		List<String> answer = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			String item = "";
			
			if (i % 3 == 0) {
				item += "Fizz";
			}
				
			if (i % 5 == 0) {
				item += "Buzz";
			}

			if (item.equals("")) {
				item += Integer.toString(i);
			}
			
			answer.add(item);
		}
		
		return answer;
	}

}
