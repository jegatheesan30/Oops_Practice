package OopsPractice;


interface Travel{
	void transport();
	public static final int speed = 23;
}

//interface can only implement cant extend but the interface to interface extends is possible

class Bus implements Travel{
	
//	if the interface method implement by the normal class we need to mention the public keyword for the visibility 
 public	void transport() {
		System.out.println("travel on bus");
	}
}

class Plane implements Travel{
	public void transport() {
		System.out.println("travel on plane");
	}
}

interface Draw{
	void draw();
	int a=234;
	public final int square_area =a*a;
}

class Rectangle implements Draw{
	public void draw() {
		System.out.println("draw the rectangle");
	}
}

class Circle implements Draw{
	public void draw() {
		System.out.println("draw the circle");
	}
}

// nested interface practice 

interface show{
	void print();
	
	interface view{
		void view();
	}
}

class Viewable implements show.view{
	public void view() {
		System.out.println("nested interface msg");
	}
	public void show() {
		System.out.println("normal interface msg");
	}
}


public class Interface {
	
	public static void main(String[] args) {
		System.out.println(Travel.speed);   //the public static final key word added before the interface
		System.out.println("area of the 234m squaer :"+Draw.square_area);
		
		Draw a = new Rectangle();
		Draw b = new Circle();
		Viewable obj = new Viewable();
		a.draw();
		b.draw();
		obj.view();
		obj.show();
	}

}
