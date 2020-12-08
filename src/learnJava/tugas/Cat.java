package learnJava.tugas;

public class Cat extends Animal {

//	public Cat(int legs) {
//		super(legs);
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setLegs(4);
		System.out.println("Kucing");
		cat.getAnimal("wishkas", "berjalan dan berlari");
	}
}
