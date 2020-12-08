package learnJava;

public class Student extends Person2{
	public Student(String a, String b, int sks, String mataKuliah) {
		super(a, b);
		this.sks = sks;
		this.mataKuliah = mataKuliah;
	}

	private int sks;
	private String mataKuliah;
	
	public void getMataKuliah() {
		System.out.println(mataKuliah);
	}
	
	public int getSks() {
		return sks++;
	}

	public int getSks(int bobot, String lecture) {
		return sks++;
	}

	public int getSks(String lecture, int bobot) {
		return sks++;
	}

	@Override
	public String getFullname() {
		// TODO Auto-generated method stub
		return "Prof " + super.getFullname();
	}
	
	
}
