package pack3;

public class Student {
	private String name;
	private Integer rollnumber;
	private Address Address;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(Integer rollnumber) {
		this.rollnumber = rollnumber;
	}

	public Address getAddress() {
		return Address;
	}

	public void setAddress(Address address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollnumber=" + rollnumber + ", Address=" + Address + "]";
	}
	

}
