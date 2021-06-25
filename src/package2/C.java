package package2;
import package1.*;

public class C {
	public String publicMessage = "This is public";// created public, can be accessed by A.
	protected String protectedMessage = "This is protected";// can only be accessed because Asub is subclass of A;
	String defaultMessage = "This is the default"; // default is none, cant be accessed in A.
	private String privateMessage = "This is the private";// can accessed by only this class.
}
