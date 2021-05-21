package URI;

import java.util.Scanner;

public class Uri_1160 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double pA, pB, txA, txB;
		int anos, t = scan.nextInt();
		
		for(int i = 0; i<t;i++) {
			pA = scan.nextInt();
			pB = scan.nextInt();
			txA = scan.nextDouble();
			txB = scan.nextDouble();
			anos = 0;
			
			while(pA <= pB) {
				pA *= 1 + txA/100;
				pA = (double)(int)(pA);
				pB *= 1 + txB/100;
				pB = (double)(int)(pB);
				anos+=1;
				if(anos >100) {
					break;
				}
			}
			if(anos>100) {
				System.out.println("Mais de 1 seculo.");
			}else {
				System.out.println(String.format("%d anos.", anos));
			}
		}
	}
}
