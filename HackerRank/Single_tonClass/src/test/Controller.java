package test;

public class Controller {

	public static void main(String[] args)throws Exception {
		
		Configuration c = Configuration.getObject();
		Configuration c1 = Configuration.getObject();
		System.out.println(c==c1);
		
		Configuration copy = (Configuration)c.clone();
		System.out.println(c== copy);
	}
}
