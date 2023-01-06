package src.com.tc.college.models;

public class TransectionStatus {

	private boolean status;
	private String message;
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "TransectionStatus [status=" + status + ", message=" + message + "]";
	}
	
}
