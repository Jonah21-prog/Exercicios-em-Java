package URI;

import java.util.Scanner;

public class Uri_1143 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i =1; i<n+1; i++) {
			System.out.println(i + " " + (int)Math.pow(i, 2) + " " + (int)Math.pow(i, 3));
		}
	}
}
