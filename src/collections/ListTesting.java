package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ListTesting {
//	METHOD UNTUK ARRAYLIST
	public void listArray() {
//		INSTANSIASI OBJEK
		ArrayList<String> makanan = new ArrayList<>();
		ArrayList<String> minuman = new ArrayList<>(Arrays.asList("coca cola", "jus jeruk"));
		System.out.println(minuman);

		System.out.println("\nUkuran awal: " + makanan.size());

		ArrayList<String> snack = new ArrayList<>();
		snack.add("Kentang Goreng");
		snack.add("Makanan Ringan");

//		MENAMBAHKAN DATA KE ARRAYLIST
		makanan.add("Nasi Goreng");
		makanan.add("Mie Goreng");
		makanan.add(1, "Kwetiaw Goreng");
		makanan.add("Nasi Goreng");
		System.out.println("Isi makanan: " + makanan);

		makanan.addAll(snack);
		System.out.println("Setelah ditambah snack" + makanan);

//		MENGHAPUS DATA
		makanan.remove(0);
		System.out.println("Hapus data index ke-0" + makanan);
		makanan.remove("Mie Goreng");
		System.out.println("Hapus data Mie Goreng" + makanan);

//		SORTING DATA
		Collections.sort(makanan);
		System.out.println("Sorted: " + makanan);

//		INDEX VALUE:
		System.out.println("\nPosition: " + makanan.indexOf("Kwetiaw Goreng"));

		Collections.sort(makanan, Collections.reverseOrder());
		System.out.println("Reversed: " + makanan);

		String[] array = { "string", "string1", "null" };
		System.out.println(Arrays.asList(array).indexOf("string"));
		
		makanan.add(0, "Salad");
		makanan.set(1, "Kue");
		System.out.println(makanan);

//		TAMPILKAN DATA
//		for (String s : makanan) {
//			System.out.println("Menampilkan value secara vertikal: " + s);
//		}

//		Iterator itr = makanan.iterator();
//		while (itr.hasNext()) {
//			System.out.println("\nprint iterator: " + itr.next());
//		}
	}

	public void arrList2D() {
		ArrayList<ArrayList<String>> list = new ArrayList<>();

//		Buat kerangka kosong untuk isi datanya / baris
		list.add(new ArrayList<>());
		list.add(new ArrayList<>());

//		for (int i = 0; i < 3; i++) {
//			list.add(new ArrayList<>());
//		}

//		Data valuenya
		list.get(0).add("data pertama");
		list.get(1).add("data kedua");

		System.out.println(list);
	}

	public static void main(String[] args) {
		ListTesting lt = new ListTesting();
		lt.listArray();

//		lt.arrList2D();
	}
}
