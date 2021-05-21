package URI;

import java.util.Scanner;

public class Uri_1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pares= 0;
		for(int i=0; i<5;i++) {
			float entrada = sc.nextFloat();
			if(entrada%2==0) {
				pares+=1;
			}
		}
		System.out.println(pares + " valores pares");
	}
}
