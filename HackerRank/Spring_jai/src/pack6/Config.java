package pack6;

public class Config implements Cloneable{
	private static Config con;
	
	private Config() {}
	
	private synchronized static Config getConfig() {
		if(con == null) {
			con = new Config();
		}
		return con;
	}// this is factory method
	@Override
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException("Don't creat clone");
	}
	
	

}
