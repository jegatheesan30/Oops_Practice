package OopsPractice;


class Cars{
	float mileage() {
		return (32);
	}
}

class Alto extends Cars{
	float mileage() {
		return (24);
	}
}

class Nissan extends Cars{
	float mileage() {
		return (22);
	}
}

class Tavera extends Cars{
	float mileage() {
		return (18);
	}
}


public class Runtime_Polymorphism {
	public static void main(String[] args) {
		Cars a;
//		using upcasting to create the child class object
		a=new Alto();  
		System.out.println("Alto mileage "+a.mileage());
		a=new Nissan();
		System.out.println("Nissan mileage "+a.mileage());
		a=new Tavera();
		System.out.println("Tavera mileage "+a.mileage());
		
	}

}
