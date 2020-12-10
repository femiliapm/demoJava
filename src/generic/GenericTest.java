package generic;

//GENERIC CLASS -- method dengan type data general / menyesuaikan input
public class GenericTest {
//	METHOD PRINT ARRAY
	public static <T> void printArray(T[] elementInput) {
		for (T element : elementInput) {
			System.out.printf("%s \n", element.getClass());
		}
		System.out.println();
	}

	public static <T> void printArray(T[][] elementInput) {
//		for (T element : elementInput) {
//			System.out.printf("%s \n", element);
//		}
		for (int i = 0; i < elementInput.length; i++) {
			for (int j = 0; j < elementInput[i].length; j++) {
				System.out.print(elementInput[i][j]);
			}
			System.out.println();
		}
	}

//	public static <T> void printArray(T input) {
//			System.out.printf("%s ", input);
//	}

	public static void main(String[] args) {
//		INPUT ARRAY
//		Integer[] intArray = { 1, 2, 3, 4, 5 };
//		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
//		String[] stringArray = { "H", "E", "L", "L", "O" };
		Integer[][] arrInteger = { { 1, 2, 3 }, { 4, 5, 6 } };
//		String string = "WORLD";

		Wilayah[] arrWilayah = { new Wilayah("Jawa Barat", "Bandung"), new Wilayah("Jawa Tengah", "Semarang"),
				new Wilayah("DKI Jakarta", "Jakarta Selatan") };

//		PRINT ARRAY
//		printArray(intArray); // print integer
//		printArray(doubleArray); // print double
//		printArray(stringArray); // print string
//		printArray(string);
		printArray(arrWilayah);
//		printArray(arrInteger);

//		for (int i = 0; i < arrWilayah.length; i++) {
//			System.out.println(arrWilayah[i]);
//		}
	}
}
