package test;

public class Configuration implements Cloneable {

	private static Configuration con;
	private Configuration() {}
	
	public synchronized static Configuration getObject() {
		if(con == null) {
			con = new Configuration();
		}
		return con;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Don't craete clone");
		
	}
	}
