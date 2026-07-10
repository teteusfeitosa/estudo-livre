package classe.exercicios;

public class Ano {
	static Boolean bissexto(int ano) { 
		if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0 ) {
			return true;
		}
		return false;
	}
}
