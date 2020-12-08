package learnJava;

public class Employee extends Person2{

	public Employee(String a, String b, String posisi, String departemen) {
		super(a, b);
		// TODO Auto-generated constructor stub
		this.position = posisi;
		this.departemen = departemen;
		
	}

	private String position;
	private String departemen;
	
	@Override
	public String getFullname() {
		// TODO Auto-generated method stub
		return super.getFullname();
	}
	
	public void getPosisi() {
		System.out.println(position);
	}
	
	public void getDepartemen() {
		System.out.println(departemen);
	}
}
