package learnJava.tugas;

public class Animal {
	private int legs;
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Animal(int legs, String color) {
		super();
		this.legs = legs;
		this.color = color;
	}
	
	public Animal() {
		super();
	}

	public void getAnimal(String food, String walk) {
		System.out.println("Hewan ini berkaki :" + this.legs);
		System.out.println("Hewan ini memakan : " + food);
		System.out.println("Hewan ini bergerak dengan :" + walk);
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
}
