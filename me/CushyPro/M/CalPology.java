package me.CushyPro.M;

public class CalPology {

	public static void triangle() {
		// หาสูตรสามเหลียม
		int l, m; //l = ความสูง m = ฐาน
		System.out.println("ใส่เลข ฐาน");
		m = Integer.parseInt(Main.Price());
		System.out.println("ใส่เลข ความสูง");
		l = Integer.parseInt(Main.Price());
		System.out.println("สูตร: 1 / 2 x " + m + " x " + l);
		double ca = 1.0 / 2.0 * m * l;
		System.out.println("หาค่าสามเหลียม: " + ca);
		Main.A();
	}

	public static void square() {
		// หาสูตรสี่เหลียม
		int w, h;
		System.out.println("ใส่เลข กว้าง");
		w = Integer.parseInt(Main.Price());
		System.out.println("ใส่เลข ยาว");
		h = Integer.parseInt(Main.Price());
		System.out.println("สูตร: " + w + " x " + h);
		double ca = w * h;
		System.out.println("หาค่าสี่เหลียม: " + ca);
		Main.A();
	}

	public static void circle() {
		// หาสูตรวงกลม
		int r;
		System.out.println("ใส่เลข รัศมี");
		r = Integer.parseInt(Main.Price());
		System.out.println("สูตร: " + 2 + " x " + Math.PI + " x " + r);
		double ca = 2 * Math.PI * r;
		System.out.println("หาค่าวงกลม: " + ca);
		Main.A();
	}

}
