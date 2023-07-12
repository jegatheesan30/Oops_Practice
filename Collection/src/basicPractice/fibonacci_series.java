package basicPractice;


class Practice{
	void fibonacci_1() {
		int n1 = -1;
		int n2 = 1;
		int sum=0;
		int i=0;
		while(i<100) {
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
			i++;
		}
	}
	
	void fibonacci_2() {
		int n1=-1;
		int n2=1;
		for(int i=0;i<10;i++) {

			System.out.println(n1+n2);
			n2=n1+n2;
			n1=n2-n1;	
		}
	
	}
	
	int n1 =-1;
	int n2 = 1;
	int e=0;
	void fib() {
		if(e<10) {
		System.out.println(n1+n2);
		n2=n1+n2;
		n1=n2-n1;
		e++;
		fib();
		}
	}
	
}

public class fibonacci_series {
	public static void main(String[] args) {
		Practice obj = new Practice();
//		obj.fibonacci_1();
//		obj.fibonacci_2();
		obj.fib();
	}
}
