package learnJava.tugas;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Bird bird = new Bird();
		
		cat.setLegs(4);
		bird.setLegs(2);
		System.out.println("Kucing");
		cat.getAnimal("daging", "berjalan");
		System.out.println();
		
		System.out.println("Bird");
		bird.getAnimal("jagung", "terbang");
	}
}
