package URI;

import java.util.Scanner;

public class Uri_1021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor = sc.nextDouble();
		double n100,n50,n20,n10,n5,n2,m1, m50,m25,m10,m5,m01;
		n100 = n50 = n20 = n10 = n5= n2 = m1=m50 = m25=m10=m5 =m01 = 0;

		n100 = valor/100.0;
		valor%=100;
		n50=valor/50.0;
		valor%=50;
		n20=valor/20.0;
		valor%=20;
		n10=valor/10.0;
		valor%=10;
		n5=valor/5.0;
		valor %=5;
		n2=valor/2.0;
		valor%=2;
		m1=valor/1.0;
		valor%=1;
		valor*=100;
		m50=(valor/50);
		valor%=50;
		m25=(valor/25);
		valor%=25;
		m10=(valor/10);
		valor%=10;
		m5 =(valor/5);
		valor%=5;

		m01 =valor;

		System.out.println("NOTAS:");
		System.out.printf("%d nota(s) de R$ 100.00\n",(int)n100);
		System.out.printf("%d nota(s) de R$ 50.00\n",(int)n50);
		System.out.printf("%d nota(s) de R$ 20.00\n",(int)n20);
		System.out.printf("%d nota(s) de R$ 10.00\n",(int)n10);
		System.out.printf("%d nota(s) de R$ 5.00\n",(int)n5);
		System.out.printf("%d nota(s) de R$ 2.00\n",(int)n2);
		System.out.println("MOEDAS:");
		System.out.printf("%d moeda(s) de R$ 1.00\n",(int)m1);
		System.out.printf("%d moeda(s) de R$ 0.50\n",(int)m50);
		System.out.printf("%d moeda(s) de R$ 0.25\n",(int)m25);
		System.out.printf("%d moeda(s) de R$ 0.10\n",(int)m10);
		System.out.printf("%d moeda(s) de R$ 0.05\n",(int)m5);
		System.out.printf("%d moeda(s) de R$ 0.01\n",Math.round(m01));
	}
}
