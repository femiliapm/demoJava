package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class SetTesting {
	public void set() {
		HashSet<String> fruits = new HashSet<>();

//		menambahkan
		fruits.add("Kiwi");
		fruits.add("Jambu");
		fruits.add("Jeruk");
		fruits.add("Pepaya");
		fruits.add("Jambu");
		System.out.println(fruits);

//		update / replace
		fruits.remove("Kiwi");
		fruits.add("Mangga");
		System.out.println(fruits);

//		ArrayList<String> arrList = new ArrayList<>();
//		arrList.addAll(fruits);
//		arrList.set(0, "Mangga");

		for (String s : fruits) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		SetTesting st = new SetTesting();
		st.set();
	}
}
