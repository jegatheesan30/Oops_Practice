package OopsPractice;

class State {
	String name;
	static String country = "india";
	static String flag="ashoka chakra";
	int numberplate;
	void display() {
	System.out.println(numberplate);
	}
	static void print()
	{
		System.out.println(country);
		System.out.println(flag);

	}

}
public class Static_variable {
	public static void main(String[] args) {
		State tamilnadu=new State();

		tamilnadu.name="Tamilnadu";
		tamilnadu.numberplate=47;
		tamilnadu.display();

		State kerala=new State();
		kerala.name="kerala";

		kerala.print();
		tamilnadu.print();


	}
}
