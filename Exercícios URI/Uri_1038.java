package URI;

import java.util.Scanner;

public class Uri_1038 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resposta ="Total: R$ %.2f\n";
		double total = 0;
		int item, qtd;
		item = sc.nextInt();
		qtd = sc.nextInt();
		
		if(item == 1) {
			total = 4*qtd;
		}else if(item == 2) {
			total = 4.5*qtd;
		}else if(item ==3) {
			total = 5*qtd;
		}else if(item == 4) {
			total = 2*qtd;
		}else if(item == 5) {
			total = 1.5*qtd;
		}
		System.out.printf(resposta,total);
	}
}
