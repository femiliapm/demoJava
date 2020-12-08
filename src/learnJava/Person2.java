package learnJava;

// WITH CONSTRUCTOR
public class Person2 {
	private String firstName;
	private String lastName;
//	PANGGIL VERSION DARI CLASS PERSON

//	METHOD GETVERSION
	public void getVersion() {
		System.out.println(Person._VERSION);
	}

	public Person2(String a, String b) {
		super();
		this.firstName = a;
		this.lastName = b;
	}

//	METHOD GETFULLNAME
	public String getFullname() {
		return firstName + " " + lastName + " ST";
	}
}
