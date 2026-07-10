package classe.exercicios;

public class ContaTeste {
	public static void main(String[] args) {
		Conta a = new Conta();
		a.titular = "Matheus Feitosa Frota";
		a.saldo = 1200D;
		
		System.out.println(a.mostrarSaldo());
		
		a.depositar(200);
		System.out.println(a.mostrarSaldo());
		
		
		System.out.println(a.mostrarSaldo());
		
		a.sacar(1000D);
		
		System.out.println(a.mostrarSaldo());
		
		a.sacar(1000D);
	}
}	
