package URI;

import java.util.Scanner;

public class Uri_1158 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nEntradas = scan.nextInt(), soma = 0, x,y;
		
		for(int i = 0; i< nEntradas; i++) {
			x = scan.nextInt();
			y = scan.nextInt();
			soma = 0;
			if(x%2 == 0) {
				x+=1;
			}
			for(int j = 0; j<y; j++) {
				soma +=x;
				x+=2;
			}
		System.out.println(soma);
		}
	}
}
