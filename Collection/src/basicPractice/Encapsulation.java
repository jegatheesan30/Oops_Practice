package basicPractice;


class Employee{
//	wrapping all the data member in single unit it contains both public and private data 
	
	private String Id;
	private int salary =40000;
	private String report;
	protected String mobileNo;
	public String name;
	private String email;
	static String roll="programmer";
	
	static void Company_details() {
		String company_name="Nila Apps";
		String location = "tidel Park";
		String ceo = "anitha";
		System.out.println(company_name+","+location+","+ceo);
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//that private data may be accessible by getter and setter method getter used for only read setter used for read & write
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public int getSalary() {
		return salary;
	}
//	if the salary goes under the final variable it can read only cant modify that
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
//	method used to print the data Employee class
	
	void print() {
		
		System.out.println(this.Id+","+this.salary+","+this.report+","+this.mobileNo+","+this.name+","+this.email+","+this.roll);
		this.Company_details();
	}
	Employee(String id,int salary,String report,String mobileNo,String name, String email){
		this.Id = id;
		this.salary =salary;
		this.report=report;
		this.mobileNo=mobileNo;
		this.name=name;
		this.email=email;
	}
	
//	{System.out.println("the new employe details are printed");} //instance initialize block
}
public class Encapsulation {
	public static void main(String[] args) {
		Employee sivakumar = new Employee("I0020342",20000,"Manager","044-234232","sivakumar","siva@gmail.com");
		Employee ramesh = new Employee("I00232323", 40000, "Team Lead","034-234234","ramesh","ramesh@gmail.com");
		System.out.println(sivakumar instanceof Employee);
		sivakumar.print();
		ramesh.print();
		
//		emp1.name="siva";
//		emp1.setId("I002342");
//		emp1.setSalary(20000);
//		emp1.setMobileNo("959595959595");
//		emp1.setReport("Manager");
//		emp1.setEmail("jsanstark@gmail.com");
//		
//		emp1.print(emp1.getId(),emp1.getSalary(), emp1.getReport(), emp1.getMobileNo(), emp1.getName(), emp1.getEmail());
	}
}
