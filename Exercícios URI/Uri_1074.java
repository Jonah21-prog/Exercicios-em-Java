package URI;

import java.util.Scanner;

public class Uri_1074 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt(), entr;
		
		for(int i = 0; i<q; i++) {
			entr = sc.nextInt();
			if(entr %2 ==0) {
				if(entr>0) {
					System.out.println("EVEN POSITIVE");
				}
				if(entr<0) {
					System.out.println("EVEN NEGATIVE");
				}
				if(entr == 0) {
					System.out.println("NULL");
				}
				
			}else {
				if(entr>0) {
					System.out.println("ODD POSITIVE");
				}
				if(entr<0) {
					System.out.println("ODD NEGATIVE");
				}
			}
		}
	}
}
