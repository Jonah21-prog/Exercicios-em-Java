package URI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1005 {
	public static void main(String[] args) {
		DecimalFormat forma = new DecimalFormat("0.00000");
		Scanner scan = new Scanner(System.in);
		double a, b, media;
		a = scan.nextDouble();
		b = scan.nextDouble();
		media = ((a * 3.5) + (b*7.5))/11;
		System.out.println("MEDIA = " + forma.format(media));
	}
}
