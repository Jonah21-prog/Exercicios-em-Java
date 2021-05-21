package URI;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uri_1008 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("U$ 0.00");
		int numFuncionario, hTrabalhada;
		numFuncionario = scan.nextInt();
		hTrabalhada = scan.nextInt();
		float valorPorH = scan.nextFloat();
		System.out.println("NUMBER = " + numFuncionario);
		System.out.println("SALARY = " + format.format(valorPorH*hTrabalhada));
	}
}
