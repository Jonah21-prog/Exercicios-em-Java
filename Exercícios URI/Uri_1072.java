package URI;

import java.util.Scanner;

public class Uri_1072 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), dentro = 0, fora = 0;
		
		for(int i = 0; i<t; i++) {
			int n = sc.nextInt();
			if(n >= 10 && n<=20) {
				dentro+=1;
			}else {
				fora+=1;
			}
				
		}
		System.out.println(dentro + " in");
		System.out.println(fora + " out");
	}
}
