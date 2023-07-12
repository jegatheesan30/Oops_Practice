package Collection_practice_old;

import java.util.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Array_list {

	public static void main(String[] args) {
		
// 	if we declare the String on the array list that list allow only string object
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("jsan");
		al.add("python");
		al.add("java");
		al.add("ruby");
		al.add("kotlin");
		al.add("groovy");
		
		System.out.println(al);
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("angular");
		al1.add("javascript");
		al1.add("reactjs");
		al1.add("nodejs");
			
//		System.out.println(al1);
		
		al.addAll(al1);
//		System.out.println(al);
//		
//		System.out.println(al.get(4));
//		
		al1.clear();
//		System.out.println(al1.isEmpty());
//		System.out.println(al.isEmpty());
		
//		simple for loop for iterate the arraylist while containa al and al1 objects
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
		
	System.out.println("list iterator is used to iterate the element where the iteration start based on the index");
		
		ListIterator<String > iterator=al.listIterator(5);
		
		while(iterator.hasNext()) {
			String i = iterator.next();
			System.out.println(i);
		}

	System.out.println("normal iterator is used to iterate the whole element in array list without based on the index");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("last index of method");
		
		System.out.println("last index of given array :"+al.lastIndexOf(al));
		
		System.out.println("using to array method to load the array list to normal array");
		Object[] arr=al.toArray();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("converting array to arrayList");
		for(int i=0;i<arr.length;i++) {
			String x = (String) arr[i];
			al.add(x);
		}
		
		System.out.println("after convert list to array");
		System.out.println(al);
		
		System.out.println(al.clone());
		
		al.set(0, "stark");
		
		System.out.println(al);
		
		List<Integer> li = new ArrayList();
		li.add(1);
		li.add(23);
		li.add(42);
		li.add(55);
		li.add(98);
		li.add(24);
		
		
		
	}
}
