package URI;

import java.util.Scanner;

public class Uri_1067 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(int i = 0; i<x+1; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
