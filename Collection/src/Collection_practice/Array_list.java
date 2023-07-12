package Collection_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array_list {
	public static void main(String[] args) {
		List <Integer> ll = new ArrayList <Integer>();
		ll.add(12);
		ll.add(2);
		ll.add(23);
		ll.add(21);
		ll.add(3343);
		ll.add(454);
		Collections.sort(ll);
		System.out.println(ll);
		}
}
