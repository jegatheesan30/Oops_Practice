package OopsPractice;
import java.util.Scanner;


class Employee{
	float salary=40000;
	}
class Programmer extends Employee{
	String name;
	int bonus = 10000;
	}

public class inheritance {
	public static void main(String[] args) {
	Programmer obj = new Programmer();
	System.out.println("Programmer total Salary :"+(obj.salary+obj.bonus));
		
	}
}
