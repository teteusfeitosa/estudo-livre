package classe.exercicios;

public class Conta {
	String titular;
	Double saldo;
	
	void sacar(Double quantidade) {
		if(saldo > 0 && quantidade < saldo) {
			saldo -= quantidade;
		}
		else {
			System.out.println("Não pode sacar mais do que você possui");
		}

	}
	
	void depositar(double quantidade) {
		saldo += quantidade;
	}
	
	String mostrarSaldo() {
		return String.format("O saldo atual do %s é de %.2fR$" ,titular,saldo);
	}
}
