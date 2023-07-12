package Collection_practice_old;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class list {

	public static void main(String[] args) {
//		collection interface extends the Iterable interface so we can't create the object for Collection 
//		and the Array list class implement the Collection class so we do up casting for ArrayList;
		
//		In the array list contain group of non similar objects using add keyword to add the object on array list
		
		Collection obj = new ArrayList();
		obj.add(23);
		obj.add("string");
		obj.add(2342);
		obj.add(0.234);
		obj.add("true");
		obj.add(234243420);
		
//		1.Using enhanced For loop.
//		2.Using Iterator method.
//		3.Using Simple For loop.
//		4.Using forEach method.
		
//		Using enhanced For loop.
		System.out.println("iterate the objects in array list using enhanced for loop");
		System.out.println();
		for(Object s:obj) {
			System.out.println(s);
		}
		
//		in iterator method we need to import the iterator class 
		System.out.println();
		System.out.println("iterate the objects in array list using Iterator method and import the iteraor package");
		Iterator it = obj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		Using Simple For loop.
		System.out.println();
		System.out.println("using simple for loop to iter the objects in array list");
		for(int i=0;i<obj.size();i++) {
			System.out.println(((List) obj).get(i));
		}

		
		
		
	}

	

}
