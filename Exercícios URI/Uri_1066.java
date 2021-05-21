package URI;

import java.util.Scanner;

public class Uri_1066 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int par, impar, positivo, negativo;
		par = impar = positivo = negativo =0;
		
		for(int i = 0; i<5;i++) {
			float entrada = sc.nextFloat();
			if(entrada >0) {
				positivo +=1;
			}
			if(entrada < 0) {
				negativo +=1;
			}
			if(entrada%2==0) {
				par +=1;
			}
			if (entrada%2 != 0) {
				impar +=1;
			}
		}
		System.out.println(String.format("%d valor(es) par(es)", par));
		System.out.println(String.format("%d valor(es) impar(es)", impar));
		System.out.println(String.format("%d valor(es) positivo(s)", positivo));
		System.out.println(String.format("%d valor(es) negativo(s)", negativo));
	}
}
