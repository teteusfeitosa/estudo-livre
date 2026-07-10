package controle;

public class Break {
	public static void main(String[] args) {
		// quebrar o fluxo natural das coisas;
		
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}
