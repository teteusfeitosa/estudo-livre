package classe.exercicios;

public class Aluno {
	String nome;
	Double nota1;
	Double nota2;
	
	Double calculaMedia() {
		return (nota1 + nota2)/2;
	}
	
	Boolean Aprovado() {
		if(calculaMedia() >= 7) {
			return true;
		}
		else {
			return false;
		}
	}
}
