package URI;

import java.util.Scanner;
public class Uri_1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor, valorOriginal, n100,n50,n20,n10,n5,n2,n1;
		n100 = n50 = n20=n10=n5=n2=n1 = 0;
		valorOriginal = sc.nextInt();
		valor = valorOriginal;
		
		if(valorOriginal >= 100) {
			n100 = valorOriginal/100;
			valor = valorOriginal%100;
		}
		if(valor >= 50) {
			n50 = valor/50;
			valor = valor%50;
		}
		if(valor>=20) {
			n20 = valor/20;
			valor = valor%20;
		}
		if(valor>=10) {
			n10 = valor/10;
			valor = valor%10;
		}
		if(valor>=5) {
			n5 = valor/5;
			valor = valor%5;
		}
		if(valor >= 2) {
			n2 = valor/2;
			valor = valor%2;
		}
		if(valor>=1) {
			n1 = valor/1;
			valor = valor%1;
		}
		System.out.println(valorOriginal);
		System.out.printf("%d nota(s) de R$ 100,00\n",n100);
		System.out.printf("%d nota(s) de R$ 50,00\n",n50);
		System.out.printf("%d nota(s) de R$ 20,00\n",n20);
		System.out.printf("%d nota(s) de R$ 10,00\n",n10);
		System.out.printf("%d nota(s) de R$ 5,00\n",n5);
		System.out.printf("%d nota(s) de R$ 2,00\n",n2);
		System.out.printf("%d nota(s) de R$ 1,00\n",n1);
		
	}
}
