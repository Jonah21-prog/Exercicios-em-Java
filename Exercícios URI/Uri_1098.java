package URI;

public class Uri_1098 {
	public static void main(String[] args) {
		for(float i = 0; i<=2.2; i+=0.2) {
			for(float j = 1; j<4; j++) {
				if(i == 0 || i ==1 || i >=1.9) {
					System.out.println(String.format("I=%d J=%d", (int)i, ((int)j+(int)i)));
				}else {
					System.out.println(String.format("I=%.1f J=%.1f", i, j+i));
				}

			}
		}
		
	}
}
