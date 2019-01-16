import java.util.*;

public class MyHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyHashSet hashSet = new MyHashSet();
		hashSet.add(1);         
		hashSet.add(2);         
		hashSet.contains(1);    // returns true
		hashSet.contains(3);    // returns false (not found)
		hashSet.add(2);          
		hashSet.contains(2);    // returns true
		hashSet.remove(2);          
		hashSet.contains(2);    // returns false (already removed)
	}
	
	private Map<Integer, List<Integer>> hashtable;

    /** Initialize your data structure here. */
    public MyHashSet() {
        hashtable = new HashMap<>();
    }
    
    public void add(int key) {
        if (!contains(key)) {
        	int hash = getHash(key);
        	
        	if (hashtable.get(hash) == null) {
        		List<Integer> list = new ArrayList<>();
        		list.add(key);
        		hashtable.put(hash, list);
        	} else {
        		List<Integer> list = hashtable.get(hash);
        		list.add(key);
        	}
        }
    }
    
    public void remove(int key) {
        if (contains(key)) {
        	int hash = getHash(key);
        	List<Integer> list = hashtable.get(hash);
        	list.remove(Integer.valueOf(key));
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
    	int hash = getHash(key);
    	List<Integer> list = hashtable.get(hash);
    	
    	if (list == null) {
    		return false;
    	} else {
        	return list.contains(key);	
    	}    	
    }
    
    private int getHash(int key) {
    	return key % 5;
    }
}
