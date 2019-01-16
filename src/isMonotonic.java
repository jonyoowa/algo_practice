
public class isMonotonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean isMonotonic(int[] A) {
        if (A.length == 1) {
        	return true;
        }
        
        boolean isIncrease = true, isDecrease = true;
        
        for (int i = 0; i < A.length - 1; i++) {
        	if (A[i + 1] > A[i]) {
        		isIncrease = false;
        		break;
        	}
        }
    	
        for (int i = 0; i < A.length - 1; i++) {
        	if (A[i + 1] < A[i]) {
        		isDecrease = false;
        		break;
        	}
        }
        
    	return isIncrease || isDecrease;
    }
}
