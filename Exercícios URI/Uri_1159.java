package URI;

import java.util.Scanner;

public class Uri_1159 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, soma;

		while(true) {
			x = scan.nextInt();
			if(x == 0) {
				break;
			}
			if(x%2 != 0) {
				x+=1;
			}
			soma = 0;
			for(int i =0; i<5; i++) {
				soma+=x;
				x+=2;
			}
			System.out.println(soma);
		}
	}

}
