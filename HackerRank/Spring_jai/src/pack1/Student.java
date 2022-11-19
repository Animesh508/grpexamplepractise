package pack1;

public class Student {
	private String name;
	private Integer rollnumber;
	private String collegename;
	public Student(String name, int rollnumber, String collegename) {
		super();
		this.name = name;
		this.rollnumber = rollnumber;
		this.collegename = collegename;
	}
	
	 public void showdata() {    // methord
		 System.out.println(this.name);
		 System.out.println(this.rollnumber);
		 System.out.println(this.collegename);
	 }

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollnumber=" + rollnumber + ", collegename=" + collegename + "]";
	}
	 
	 
	
	

}
