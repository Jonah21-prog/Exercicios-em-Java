package URI;

import java.util.Scanner;
public class Uri_1017 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tempo, velMed, dist;
		double consumo;
		tempo = sc.nextInt();
		velMed = sc.nextInt();
		dist = tempo*velMed;
		consumo = dist/12.0;
		System.out.printf("%.3f\n", consumo);
				
	}
}
