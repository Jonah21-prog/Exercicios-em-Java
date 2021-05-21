package URI;

import java.util.Scanner;

public class Uri_1007 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b,c,d,dif;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		dif = (a*b - c*d);
		System.out.println("DIFERENCA = " + dif);
	}
}
