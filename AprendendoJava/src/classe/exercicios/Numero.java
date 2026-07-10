package classe.exercicios;

public class Numero {
	static boolean par(int num) { 
		if(num % 2 == 0) {
			return true;
		}
		return false;
	}
		
	
	static boolean positivo(int num) {
		if(num > 0) {
			return true;
		}
		return false;
	}
	
	static boolean primo(int num) {
	    if (num <= 1) return false; // Números menores ou iguais a 1 não são primos

	    // Um único loop testa se o 'num' tem divisores
	    for (int j = 2; j * j <= num; j++) {
	        if (num % j == 0) {
	            return false; // Achou um divisor, interrompe e diz que NÃO é primo
	        }
	    }
	    
	    return true; // Se o loop acabou e não achou divisor, É primo
	}

	
}
