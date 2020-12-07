package demoJava;

public class Constructor {
	public int alas;
	public int tinggi;
	
	public Constructor(int alas, int tinggi) {
		super();
		this.alas = alas;
		this.tinggi = tinggi;
	}
	
	public static void main(String[] args) {
		Constructor constructor = new Constructor(2, 4);
		System.out.println("alas: " + constructor.alas);
		System.out.println("tinggi:" + constructor.tinggi);
	}
}
