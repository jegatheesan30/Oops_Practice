package basicPractice;

interface A{
	void msg();
}
interface B{
	void msg();
}

class C implements A,B{

	public void msg() {
		
	}
}



public class inter {
	public static void main(String[] args) {
		C obj = new C();
	}
}
