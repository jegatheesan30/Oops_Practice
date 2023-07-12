package Collection_practice_old;
import java.util.*;


public class ArrayListp {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();  
		list.add(55);  
		list.add(34);  
		list.add(98);  
		list.add(67);  
		list.add(39);  
		list.add(76);  
		list.add(81);  
		System.out.println("Before Sorting: "+ list);   
		
		Collections.sort(list);  
		
		System.out.println("After Sorting: "+ list);   
	}
}
