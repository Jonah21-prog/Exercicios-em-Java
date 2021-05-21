package URI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1006 {
	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat("0.0");
		Scanner scan = new Scanner(System.in);
		double a, b, c, media;
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		media = ((a*2)+(b*3)+(c*5))/10;
		System.out.println("MEDIA = " + format.format(media));
	}
}
