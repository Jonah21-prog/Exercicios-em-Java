package URI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1009 {
	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat("R$ 0.00");
		Scanner scan = new Scanner(System.in);
		String nome = scan.nextLine();
		float sFixo = scan.nextFloat();
		double vendas = scan.nextDouble();
		double bonus = vendas*0.15;
		double total = bonus + sFixo;
		System.out.println("TOTAL = " + format.format(total));
		
		
	}
}
