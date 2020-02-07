class Person{
	private String name;
	private String address;
	Person(String name, String address){
		this.name=name;
		this.address=address;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
}
class Student extends Person{
	private String program;
	private int year;
	private double fee;
	Student(String name, String address, String program, int year, double fee){
		new Person(name,address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
	public String getProgram(){
		return program;
	}
	public int getYear(){
		return year;
	}
	public double getFee(){
		return fee;
	}
}
class Staff extends Person{
	private String school;
	private double pay;
	Staff(String name, String address, String school, double pay){
		new Person(name,address);
		this.school=school;
		this.pay=pay;
	}
	public String getSchool(){
		return school;
	}
	public double getPay(){
		return pay;
	}
}
class Main{
	public static void main(String args[]){
		String name="Arjun";
		String address="Nagai";
		//object for Person class
		
		Person p=new Person(name,address);
		System.out.println("-------------------------------");
		System.out.println("Person Details...");
		System.out.println("Name: "+p.getName());
		System.out.println("Address: "+p.getAddress());
		System.out.println("-------------------------------");
		//object for Student class
		Student std=new Student(name,address,"M.Sc CS",2020,45000);
		System.out.println("Student Details...");
		System.out.println("Name: "+std.getName());
		System.out.println("Address: "+std.getAddress());
		System.out.println("Program: "+std.getProgram());
		System.out.println("Year: "+std.getYear());
		System.out.println("Fee: "+std.getFee());
		System.out.println("-------------------------------");
		
		//object for Staff class
		Staff staff=new Staff(name,address,"VIT",60000);
		System.out.println("Staff Details...");
		System.out.println("Name: "+staff.getName());
		System.out.println("Address: "+staff.getAddress());
		System.out.println("School: "+staff.getSchool());
		System.out.println("Pay: "+staff.getPay());
		System.out.println("-------------------------------");
	}
}