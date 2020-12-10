package generic;

//GENERIC CLASS -- method dengan type data general / menyesuaikan input
public class GenericTest {
//	METHOD PRINT ARRAY
	public static <T> void printArray(T[] elementInput) {
		for (T element : elementInput) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static <T> void printArray(T input) {
			System.out.printf("%s ", input);
	}

	public static void main(String[] args) {
//		INPUT ARRAY
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		String[] stringArray = { "H", "E", "L", "L", "O" };
		String string = "WORLD";

//		PRINT ARRAY
		printArray(intArray); // print integer
		printArray(doubleArray); // print double
		printArray(stringArray); // print string
		printArray(string);
	}
}
