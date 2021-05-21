package URI;

public class Uri_1156 {
	public static void main(String[] args) {
		double sequencia = 0, divisor = 1;
		
		for(int i = 1; i<=39;i+=2) {
			sequencia+=i/divisor;
			divisor*=2;
		}
		System.out.println(String.format("%.2f", sequencia));
	}
}
