import java.util.*;

public class uncommonFromSentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test = uncommonFromSentences("this apple is sweet", "this apple is sour");
		
		int end = 0;
	}
	
    public static String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> word_map = new HashMap<>();
        
        String[] a_array = A.split(" ");
        String[] b_array = B.split(" ");
        
        addToMap(a_array, word_map);
        addToMap(b_array, word_map);
        
        List<String> answer = new ArrayList<>();
        
        for (Map.Entry<String, Integer> entry : word_map.entrySet()) {
        	if (entry.getValue() == 1) {
        		answer.add(entry.getKey());
        	}
        }
        
    	return answer.toArray(new String[answer.size()]);
    }	
    
    public static void addToMap(String[] array, Map<String, Integer> map) {
        for (int i = 0; i < array.length; i++) {
        	if (map.get(array[i]) == null) {
        		map.put(array[i], 1);
        	} else {
        		map.put(array[i], 1 + map.get(array[i]));
        	}
        }
    }
    
    
}
