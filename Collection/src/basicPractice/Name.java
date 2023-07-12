package basicPractice;

class Name1{
	int no=100;
	int k=10;
	int s=1;

	void J() {
		int no=100;
		int k=10;
		int s=1;
		for(int i=1;i<=no;i++) {
			int a=i%k;
			if(a==k/2||i==a||i==91||i==92||i==93||i==94||i==95||i==71||i==81||i==91)
				System.out.print(" *");
				else
				System.out.print("  ");
			if(a==0)
				System.out.println();
		}

	}

	void S() {
		for(int i=1;i<=no;i++) {
			int a=i%k;
			if(i==a||i==a+40||i==a+90||i==11||i==21||i==31||i==59||i==69||i==79||i==89)
				System.out.print(" *");
			else
				System.out.print("  ");
			if(a==0)
				System.out.println();
		}
	}

	void E() {
		for(int i=1;i<=no;i++) {
			int a=i%k;
			if(a==1||i==a||i==a+90||i==a+40)
				System.out.print(" *");
			else
				System.out.print("  ");
			if(a==0)
				System.out.println();
		}
	}

	void G() {
		for(int i=1;i<=no;i++) {
			int a=i%k;
			if(a==1||i==a||i==a+90||i==59||i==69||i==79||i==89||i==47||i==48|i==49)
				System.out.print(" *");
			else
				System.out.print("  ");
			if(a==0)
				System.out.println();
		}
	}

	void A() {
		for(int i=1;i<=no;i++) {
			int a=i%k;
			if(a==i%2||i==a+40||i==a) 
				System.out.print(" *");
			else
				System.out.print("  ");
			if(a==0)
				System.out.println(); 
		}
	}



	void H() {
		for(int i=1;i<=no;i++) {
			int a=i%k;
			if(a==i%2||i==a+40)
				System.out.print(" *");
			else
				System.out.print("  ");
			if(a==0)
				System.out.println();
		}
	}

	void N() {
		for(int i=1;i<=no;i++) {
			int a=i%k;
			if(a==i%2||i==12||i==23||i==34||i==45||i==56||i==67||i==78||i==89) 
				System.out.print(" *");
			else
				System.out.print("  ");
			if(a==0)
				System.out.println();
		}
	}
	void T() {
		for(int i=1;i<=no;i++) {
			int a=i%k;
			if(a==k/2||i==a)
				System.out.print(" *");
				else
				System.out.print("  ");
			if(a==0)
				System.out.println();
		}
	}
}

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name1 Myname=new Name1();
		Myname.J();
		Myname.E();
		Myname.G();
		Myname.A();
		Myname.T();
		Myname.H();
		Myname.E();
		Myname.E();
		Myname.S();
		Myname.A();
		Myname.N();
	}

}
