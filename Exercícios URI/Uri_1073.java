package URI;

import java.util.Scanner;

public class Uri_1073 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entrada = sc.nextInt();
		
		for(int i = 1; i<entrada+1; i++) {
			if(i%2==0) {
				System.out.println(i+"^2 = "+(int)Math.pow(i, 2));
			}
		}
	}
}
