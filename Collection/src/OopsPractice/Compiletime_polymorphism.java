package OopsPractice;

class Square{
	void calulation(int a) {
		System.out.println("square area :"+a*a);
	}
	void calculation(int a,int b) {
		System.out.println("square area :"+a*b);
	}
	void calculation(int a, int b , int c) {
		System.out.println("sqaure of are :"+a*b*c);
	}
}

//class rectangle{
//	void area(int a, int b) {
//		System.out.println(a*b);
//	}
//}

//class triangle{
//	void area(int a, int b) {
//		System.out.println((1/2)*(a*b));
//	}
//}

public class Compiletime_polymorphism {

	public static void main(String[] args) {
		Square a = new Square();
		a.calulation(23);
		a.calculation(23, 32);
		a.calculation(234, 232, 112);
		
	}
}
