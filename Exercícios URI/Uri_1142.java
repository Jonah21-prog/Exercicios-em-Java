package URI;

import java.util.Scanner;

public class Uri_1142 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(), linhas = 1, x=1;
		
		
		while(true) {
			if(linhas>n) {
				
				break;
				
			}else if(x%4==0) {
				
				System.out.println("PUM");
				linhas+=1;
				x+=1;
				continue;
				
			}
			
			System.out.printf("%d ", x);
			x+=1;
		}
			
	}
}
