
public class removeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int removeElement(int[] nums, int val) {
	    int len = nums.length;
	    for (int i = 0 ; i< len; ++i){
	        while (nums[i] == val && i< len) {
	        	nums[i] = nums[--len];
	        }
	    }
	    
	    return len;
	}

}
