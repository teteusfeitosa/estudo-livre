package classe;

public class Pessoa {
	String nome;
	double peso;
	
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.pesoDaComida;
		}
	}
}
