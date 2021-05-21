package URI;

import java.util.Scanner;

public class Uri_1154 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade, soma = 0, n=0;
		double media = 0.0;
		
		while(true) {
			idade = scan.nextInt();
			if(idade<0) {
				break;
			}
			soma+=idade;
			n+=1;
		}
		media = soma/(float)n;
		System.out.println(String.format("%.2f", media));
	}
	
}
