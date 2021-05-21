package URI;

import java.util.Scanner;

public class Uri_1040 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1,n2,n3,n4, notaExame;
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		n3 = sc.nextFloat();
		n4 = sc.nextFloat();
		double media = (n1*2+n2*3+n3*4+n4*1)/10;
		System.out.printf("Media: %.1f\n",media);
		if(media>=7) {
			System.out.println("Aluno aprovado.");
		}else if(media<5) {
			System.out.println("Aluno reprovado.");
		}else if(media >= 5 && media < 7) {
			System.out.println("Aluno em exame.");
			notaExame = sc.nextFloat();
			System.out.println("Nota do exame: "+notaExame);
			media = (media+notaExame)/2;
			if(media>=5) {
				System.out.println("Aluno aprovado.");
			}else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n",media);
		}
	}
}
