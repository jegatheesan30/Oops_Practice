package basicPractice;

import java.util.Scanner;

class OopsPractice {
	Scanner sc = new Scanner(System.in);

//	method for reverse a number
	void reverseNumber() {
		System.out.println("enter the number");
		long a = sc.nextLong();
		long rev = 0;

		int i = 0;
		while (i < a) {
			long rem = a % 10;
			rev = (rev * 10) + rem;
			a /= 10;
		}
		System.out.println(rev);
	}

	String reverseString(String s) {
//  System.out.println("enter the string");
		String value = s;
		String reverse = "";

		for (int j = value.length() - 1; j >= 0; j--) {
			char ch = value.charAt(j);
			reverse += ch;
		}
		return reverse;
	}

//	method for check the given string is palindrom or not using recursion
	void palindrome(String data) {
		String s = data;
		String check = this.reverseString(s);

		if (check.contains(s)) {
			System.out.println("Given string " + "'" + s + "'" + " is palindrom");
		} else {
			System.out.println("given string " + "'" + s + "'" + " is not palindrom");
		}
	}

// method used for reverse the elements in given array
	void reverseArray(int a[]) {
		int array[] = a;
		for (int i = array.length - 1; i > 0; i--) {
			System.out.print(array[i] + ",");
		}
	}

// Method used for sorting an array	
	int[] sorting_array(int a[]) {
		int array[] = a;
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

//	method used for find the duplicate on array
	void array_dup(int a[]) {
		int array1[] = a;
		int array[] = this.sorting_array(array1);
		System.out.println("array after sorting");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			count = 0;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					break;
				}
			}
			if (count > 0) {
				System.out.println(a[i] + ",");
			}
		}
	}

//	method for find the duplicate on given string
	void find_duplicate_string(String name) {
		String str = name;
		int count = 0;
		int length = name.length();
		for (int i = 0; i < length; i++) {
			count = 0;
			for (int j = 0; j < length; j++) {
				if (str.charAt(i) == str.charAt(j) && i > j) {
					break;
				}
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count > 1) {

				System.out.println(str.charAt(i) + " " + count);
				// break;
			}
		}
	}

	int find_biggest_element(int a[], int b) {
		int array[] = a;
		int temp = array[0];
		for (int i = 0; i < array.length; i++) {
			if (temp < array[i]) {
				temp = array[i];
			}
		}

		return temp;
	}

//	int  sorting_array() {
//		
//	}
}

public class palindrom {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// System.out.println("enter the int for first object");
		// int obj1=s.nextInt();

		OopsPractice obj = new OopsPractice();
		// obj.reverseNumber();
		// obj.reverseString();

//		System.out.println("enter the string to call the palindrom method ");
//		String str = s.next();
//		obj.palindrome(str);

		int a[] = { 23, 2, 1, 23, 45, 45, 12, 12, 1 };
//		obj.find_duplicate_array(a);

//		System.out.println("enter the name to find duplicate");
//		String name = s.next();
//		obj.find_duplicate_string(name);

//		obj.reverseArray(a);

		obj.array_dup(a);

		int length = a.length;
		System.out.println("Biggest number in given array :" + obj.find_biggest_element(a, length));
		
		
		
	}

}
