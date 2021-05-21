package URI;

import java.util.Scanner;

public class Uri_1164 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt(), x,soma;
		
		for(int i = 0; i<t; i++) {
			x = scan.nextInt();
			soma =0;
			for(int j =1; j<x;j++) {
				if(x%j ==0) {
					soma+=j;
				}
			}
			if(soma ==x) {
				System.out.println(x + " eh perfeito");
			}else {
				System.out.println(x + " nao eh perfeito");
			}
		}
	}
}
