package URI;

public class Uri_1097 {
	public static void main(String[] args) {
		int i = 1, j=7;
		while (i<10) {
			for(;j<16;j+=2) {
				for(int x = j; x>j-3;x--) {
					System.out.println("I="+i +" J="+x);
				}
				i+=2;
			}
		}
	}
}

