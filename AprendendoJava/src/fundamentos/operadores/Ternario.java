package fundamentos.operadores;

public class Ternario {
	public static void main(String... args) {
		double media = 4.9;
		String resultadoRecuperaçao  = media >= 5 ? "recuperação" : "Reprovado";
		String resultado =  media >= 7 ? "aprovado" : "recuperação";
		
		System.out.println("o aluno está " + resultado);
	}
}
