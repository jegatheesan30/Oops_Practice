package OopsPractice;


abstract class Bank{
	abstract void interest(); //curly brasses not required because the abstract class can't be instantiated
	void loan() {
		System.out.println("maximum limi of loan :"+200000);
	}
//	if the class mentioned with abstract keyword it can't be instantiated so there is no need to give abstract keyword for the variable and constructor
	
	
//	if the class is abstract the internal method is a choice to provide abstract or not if its provide with abstract it can't be directly used without extends
	String branchName;
}


class HDFC extends Bank{

	void interest() {
		System.out.println(super.branchName="trichy");
		System.out.println("interest rate is :"+18+"%");
		super.loan();
	}
	
}

public class Abstract {
	public static void main(String[] args) {
		Bank obj = new HDFC();
		obj.interest();
	}
}
