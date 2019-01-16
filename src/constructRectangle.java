import java.util.*;

public class constructRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int[] constructRectangle(int area) {
        int[] answer = new int[2];
		
        if (area == 0){
            return answer;
        }
        
        int width = (int)Math.sqrt(area);
        
        while (area % width != 0){
        	width--;
        }
        
        return new int[] { area / width, width };
	}

}
