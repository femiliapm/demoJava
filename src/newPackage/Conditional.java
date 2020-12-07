package newPackage;

public class Conditional {
//	public int time;

	public void hari(int time) {
		if (time > 18) {
			System.out.println("Hari Malam");
		} else {
			System.out.println("Hari Pagi");
		}
	}
	
	public void looping() {
		for (int i = 0; i < 7; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Conditional conditional = new Conditional();
		conditional.hari(20);
		conditional.looping();
		
		LuasSegitiga luasSegitia = new LuasSegitiga();
		System.out.println(luasSegitia.num);
	}
}
