package OopsPractice;



class Birds{
	String name="bird";
	String leg="two";
	String movement="fly";
	String nature="herbivorous";
	
	void eat() {
		System.out.println("eating");		
	}
}
 class Eagle extends Birds{
	String name="Eagle";
	void nature() {
		System.out.println(this.name);
		this.eat();
	}
 }
 
 class Sparrow extends Birds{
	 String name = "sparrow";
	 
	 void nature() {
		 System.out.println(this.name+"singing"); 
		 this.eat();
	 }
	 void eat(){
		 System.out.println("eating insects");
	 }
 }
public class singleLevel {
	
	public static void main(String[] args) {
		Eagle obj1 = new Eagle();
		obj1.nature();
		Sparrow obj2 = new Sparrow();
		obj2.nature();
		
	}

}
