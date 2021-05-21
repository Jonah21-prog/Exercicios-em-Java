package URI;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uri_1002 {
	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat("0.0000");
		Scanner scan = new Scanner(System.in);
		final double PI = 3.14159;
		double raio = scan.nextDouble();
		double area = PI*Math.pow(raio, 2);
		System.out.println("A="+ format.format(area));
	}
	
}
