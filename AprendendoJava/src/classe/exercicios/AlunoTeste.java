package classe.exercicios;

public class AlunoTeste {
	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.nome = "Lucas";
		a.nota1 = 7.9;
		a.nota2 = 6.9;
		
		System.out.println(a.calculaMedia());
		
		if(a.Aprovado()) {
			System.out.println("Você não é burro");
		}
		else {
			System.out.println("Você é burraõ");
		}
	}
}
