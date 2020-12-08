package learnJava;

public class Person {
	private String firstName;
	private String lastName;
	public static final String _VERSION = "1.0";
//	public final int num = 0;
	
//	METHOD GETFULLNAME
	public String getFullname() {
		return firstName + " " + lastName;
	}
	
//	METHOD GETVERSION
	public void getVersion() {
		System.out.println(_VERSION);
//		System.out.println(this.num);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
