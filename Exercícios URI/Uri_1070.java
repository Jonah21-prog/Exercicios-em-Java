package URI;

import java.util.Scanner;

public class Uri_1070 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x%2==0) {
			x+=1;
		}
		for(int i = 0; i<6; i++) {
			System.out.println(x);
			x+=2;
		}
	}
}
