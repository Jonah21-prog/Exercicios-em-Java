package URI;

import java.util.Scanner;

public class Uri_1133 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x= scanner.nextInt(), y = scanner.nextInt();
		
		if(x<=y) {
			for(int i = x+1; i<y; i++) {
				if(i%5 == 2 || i%5==3) {
					System.out.println(i);
				}
			}
		}else {
			for(int i = y+1;i<x;i++) {
				if(i%5 ==2 || i%5==3) {
					System.out.println(i);
				}
			}
		}
	}
}
