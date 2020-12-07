package newPackage;

public class LuasSegitia {
	public int alas = 5;
	public int tinggi = 15;
	public int luas;
	final int alasBaru = 20;
	public String nama;
	protected int num = 25;

	public void luasMethod() {
		luas = this.alasBaru * tinggi / 2;
		System.out.println(luas);
	}
	
	public int luasInteger(int a, int t) {
		luas = a * t /2;
		return luas;
	}

	public static void main(String[] args) {
		LuasSegitia luasSegitiga = new LuasSegitia();
		luasSegitiga.luasMethod();
		
		System.out.println(luasSegitiga.luasInteger(3, 10));
	}
}
