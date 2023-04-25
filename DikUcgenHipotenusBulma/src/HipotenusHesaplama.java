import java.util.Scanner;

public class HipotenusHesaplama {

	public static void main(String[] args) {

		int a, b;
		double c;
		double alan, u;

		Scanner inp = new Scanner(System.in);
		
		System.out.println("1.Kenarı Giriniz :");
		a = inp.nextInt();
		
		System.out.println("2.Kenarı Giriniz :");
		b = inp.nextInt();
		
		System.out.println("3.Kenarı Giriniz :");
		c = inp.nextDouble();

		// c = Math.sqrt((a*a) + (b*b));
		// System.out.println("Hipotenüs :" + c);

		u = (a + b + c) / 2;
		alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
		System.out.println("Üçgen alanı :" + alan);
	}

}
