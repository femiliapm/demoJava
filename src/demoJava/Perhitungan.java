package demoJava;

import java.util.Scanner;

public class Perhitungan implements Luas {
	public int luas, alas, tinggi;
	
	@Override
	public void luasSegitiga() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("masukkan alas");
		alas = in.nextInt();
		System.out.println("masukkan tinggi");
		tinggi = in.nextInt();
		in.close();
		luas = alas * tinggi / 2;
		System.out.println("luas segitiga: " + luas);
	}

	public static void main(String[] args) {
		Perhitungan hitung = new Perhitungan();
		hitung.luasSegitiga();
	}

	@Override
	public void luasPersegi() {
		// TODO Auto-generated method stub
		
	}
}
