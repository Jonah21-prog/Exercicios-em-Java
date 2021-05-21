package URI;

import java.util.Scanner;

public class Uri_1020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dias, meses, anos;
		dias = sc.nextInt();
		meses = anos = 0;
		anos = dias/365;
		dias %= 365;
		meses = dias/30;
		dias%=30;
		
		System.out.printf("%d ano(s)\n",anos);
		System.out.printf("%d mes(es)\n",meses);
		System.out.printf("%d dia(s)\n",dias);
	}
}
