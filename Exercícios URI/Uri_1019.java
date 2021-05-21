package URI;

import java.util.Scanner;
public class Uri_1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int segundos, horas, minutos;
		horas = minutos = 0;
		segundos = sc.nextInt();
		if(segundos>=3600) {
			horas = segundos/3600;
			segundos = segundos%3600;
		}
		if(segundos>=60) {
			minutos = segundos/60;
			segundos = segundos%60;
		}
		System.out.println(horas+":"+minutos+":"+segundos);

	}

}
