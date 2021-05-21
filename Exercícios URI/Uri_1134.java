package URI;

import java.util.Scanner;

public class Uri_1134 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int alcool = 0, gasolina = 0, diesel = 0, entrada;
		
		while(true) {
			entrada = scanner.nextInt();
			if(entrada ==1) {
				alcool+=1;
			}else if(entrada==2) {
				gasolina+=1;
			}else if(entrada==3) {
				diesel+=1;
			}else if(entrada==4) {
				break;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
	}
}
