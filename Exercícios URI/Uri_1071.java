package URI;

import java.util.Scanner;

public class Uri_1071 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = 0;
		if(x<y) {
			for(int i = x+1; i<y; i++ ) {
				if(i%2!=0) {
					soma+=i;
				}
			}
		}else if(x>y) {
			for(int i = y+1; i< x; i++) {
				if(i%2!=0) {
					soma+=i;
				}
			}
		}
		System.out.println(soma);
	}
}
