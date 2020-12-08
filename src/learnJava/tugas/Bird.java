package learnJava.tugas;

public class Bird extends Animal implements NameInterface{

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		System.out.println("Burung");
		bird.setLegs(2);
		bird.getAnimal("jagung", "terbang");
	}
	
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.getName();
	}

}
