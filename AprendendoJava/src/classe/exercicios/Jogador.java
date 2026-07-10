package classe.exercicios;

public class Jogador {
	int vida;
	String nome;
	
	Jogador(){
		
	}
	
	public int atacar(Jogador jogador) {
		if(jogador.vida < 0) {
			return jogador.vida = 0;
		}
		jogador.vida -= 10;
		return jogador.vida;
	}
	
	public int sofrerDano() {
		if(vida < 0) {
			return vida = 0;
		}
		return vida -= 10;
	}
	
	public String mostrarVida() {
		return String.format("A sua vida atual do jogador %s %d ", nome, vida);
	}
}
