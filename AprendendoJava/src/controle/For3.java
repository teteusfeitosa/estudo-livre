package controle;

public class For3 {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(i); //Escopo de variável,algoritmo executa de forma sequencial;
		}
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d] [%d]\n",i,j);
			}
		}
		
	}
}
