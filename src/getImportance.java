import java.util.*;

public class getImportance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int getImportance(List<Employee> employees, int id) {
		int total = 0;
		
        HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();
        for (Employee e : employees) {
            map.put(e.id, e);
        }
		
		for (Employee e : employees) {
			if (e.id == id) {
				total = getSubImp(e, map);
				break;
			}
		}
		
		return total;
	}
	
    public static int getSubImp(Employee e, HashMap<Integer, Employee> map) {
        int total = e.importance;
        
        if (e.subordinates != null) {
            for (Integer id : e.subordinates) {
            	total += getSubImp(map.get(id), map);
            }    
        }
        
        return total;
    }
}
