
public class romanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String example = "MMCMXLII";
		romanToInt(example);
	}
	
	public static int romanToInt(String s) {
		int answer = 0;
		char previous = Character.MIN_VALUE;
		
		for (int i = 0; i < s.length(); i++) {
			answer += getChValue(s.charAt(i), previous);
			previous = s.charAt(i);
		}
		
		return answer;
	}
	
	public static int getChValue(char c, int previous) {
		int val;
		switch (c) {
			case 'I': val = 1; break;
			
			case 'V': val = 5; 
	  		  if (previous == 'I') {
		  			  val -= 2;
		  		  }	
		  		  
		  		  break;
			
			case 'X': val = 10; 
	  		  		  if (previous == 'I') {
	  		  			  val -= 2;
	  		  		  }
	  		  		  
	  		  		  break;
			
			case 'L': val = 50;
			  		  if (previous == 'X') {
			  			  val -= 20;
			  		  }	
	
			  		  break;
			
			case 'C': val = 100; 
					  if (previous == 'X') {
						  val -= 20;
					  }	
			
					  break;
			
			case 'D': val = 500; 
			  		  if (previous == 'C') {
			  			  val -= 200;
			  		  }	
			  		  
			  		  break;
			
			case 'M': val = 1000; 
					  if (previous == 'C') {
						  val -= 200;
					  }
					  
					  break;
					  
			default: val = -1;
		}
			
		return val;
	}
}
