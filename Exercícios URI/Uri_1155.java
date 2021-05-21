package URI;

public class Uri_1155 {

	public static void main(String[] args) {
		double sequencia = 0;
		
		for(int i = 1;i<101;i++) {
			sequencia+=1/(float)i;
		}
		System.out.println(String.format("%.2f", sequencia));
	}

}
