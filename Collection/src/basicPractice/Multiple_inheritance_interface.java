package basicPractice;

interface Java{
	default void data() {
		System.out.println("interface msg");
	};
	
	static int RectArea(int x,int y) {
		return (x*y);
	}
}

interface Show{
	void msg(String name);
}


class Data implements Java,Show{
	public void msg() {
		System.out.println("hello world");
	}
	public void msg(String name) {
		System.out.println(name +" from java language");
	}
}

public class Multiple_inheritance_interface {
	
	public static void main(String[]args) {
		Data obj = new Data();
		obj.msg();
		obj.msg("jsan");
		obj.data();
		
		System.out.println("Rectangle are :"+Java.RectArea(23, 235));

	}

}
