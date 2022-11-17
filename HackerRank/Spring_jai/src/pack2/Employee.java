package pack2;


public class Employee {
	private Integer employeeId;
	private String employeeName;
	private String employeeDepertmentname;
	private Project project;
	
	public Employee(Integer employeeId, String employeeName, String employeeDepertmentname, Project project) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepertmentname = employeeDepertmentname;
		this.project = project;
	}
	

	public Integer getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmployeeDepertmentname() {
		return employeeDepertmentname;
	}


	public void setEmployeeDepertmentname(String employeeDepertmentname) {
		this.employeeDepertmentname = employeeDepertmentname;
	}


	public Project getProject() {
		return project;
	}


	public void setProject(Project project) {
		this.project = project;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDepertmentname="
				+ employeeDepertmentname + ", project=" + project + "]";
	}
	
	

}
