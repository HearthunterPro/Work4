package me.CushyPro.M;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	}

	public static void A() {
		System.out.println("เลือกสูตร");
		System.out.println("1. สามเหลียม");
		System.out.println("2. สีเหลียม");
		System.out.println("3. วงกลม");
		String cmd = Price();
		if (cmd.equals("1")) {
			CalPology.triangle();
		} else if (cmd.equals("2")) {
			CalPology.square();
		} else if (cmd.equals("3")) {
			CalPology.circle();
		}
	}

	@SuppressWarnings("resource")
	public static String Price() {
		Scanner sc = new Scanner(System.in);
		String m = sc.nextLine();
		return m;
	}

}
