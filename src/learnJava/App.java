package learnJava;

public class App {
	public static void main(String[] args) {
//		Person p = new Person();
//		p.setFirstName("Budi");
//		p.setLastName("Raharja");
//		System.out.println(p.getFullname());
//		p.getVersion();
//		System.out.println();
//
//		Person2 p2 = new Person2("Adelia", "Putri");
//		System.out.println(p2.getFullname());
//		p2.getVersion();
//		System.out.println();

//		Student s = new Person2("A", "B");
		Student s = new Student("a", "b", 12, "matkul");
		Person2 person = new Person2("A", "B");
		Employee e = new Employee("firstname", "lastname", "staff", "IT");
		System.out.println(person.getFullname());
		System.out.println(s.getFullname());
		System.out.println(e.getFullname());
//		s.getMataKuliah();
//		System.out.println(s.getSks());
//		person.getVersion();
	}
}
