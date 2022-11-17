package pack2;

public class Project {
	private Integer serialNumber;
	private String projectname;
	private String clientName;
	private Integer teamSize;
	public Integer getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public Integer getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}
	@Override
	public String toString() {
		return "Project [serialNumber=" + serialNumber + ", projectname=" + projectname + ", clientName=" + clientName
				+ ", teamSize=" + teamSize + "]";
	}
	
	

}
