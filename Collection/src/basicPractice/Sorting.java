package basicPractice;

public class Sorting {
	public static void main(String[] args) {
		int a[]= {64, 34, 25, 12, 12, 22, 11, 90};
		
		int temp = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("duplicates");
		int count=0;
		for(int i=0;i<a.length;i++) {
			count=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					break;
				}
			}
			if(count>0) {
				System.out.println(a[i]);
			}
		}
	}
}
