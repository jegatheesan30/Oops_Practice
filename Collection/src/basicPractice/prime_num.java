package basicPractice;
import java.util.Scanner;

public class prime_num {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("provide first limit");
	int num1 = sc.nextInt();
	System.out.println("provide second limit");
	int num2 = sc.nextInt();
	int count=0;
	if(num1==0||num2==0||num1==1||num2==1) {
		System.out.println("Can't find the prime for given limit");
	}else {
		System.out.println("prime number between give limits");
		for(int i=num1;i<num2;i++) {
			count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count=1;
					break;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}
	}
	}

}
