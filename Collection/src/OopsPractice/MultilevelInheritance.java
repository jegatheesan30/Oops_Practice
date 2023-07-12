package OopsPractice;


class Animal{
	void family() {
		System.out.println("animal");
	}
	void eat() {
		System.out.println("eating");
	}
}

class Bird extends Animal{
	void nature() {
		System.out.println("Bird");
		System.out.println("fly");
	}
	void movement() {
		System.out.println("walk run and fly");
	}
	
}

class Ostritch extends Bird{
//	void nature() {
//		System.out.println("Bird");
//		System.out.println("cant fly");
//	}
	void movement() {
		System.out.println("rund faster & cant fly");
	}
}

// the below code mention the hierachical inheritance


class fish extends Animal{
	void live() {
		System.out.println("living in water");
	}
}


public class MultilevelInheritance {
	
	public static void main(String[] args) {
		System.out.println("multi level inheritance example");
		 Bird obj = new Bird();
		 obj.movement();
		 obj.nature();
		 obj.eat();
		 obj.family();
		 System.out.println();
		 System.out.println("Hierachical inheritance example");
		 fish obj1 = new fish();
		 obj1.family();
		 obj1.eat();
		 obj1.live();
		 
	}

}
