package classe.exercicios;

public class Televisao {
	static int canal;
	static int volume;
	
	static int aumentaVolume() {
		return volume += 10;
	}
	static int diminuiVolume() {
		return volume -= 10;
	}
	static void trocaCanal(int novoCanal) {
		if(novoCanal > 0 && canal > 0 )
		canal = novoCanal;
		System.out.println("Agora o canal é o " + canal);
	}
	
	public static void main(String[] args) {
		Televisao.canal = 10;
		
		Televisao.trocaCanal(5);
		
		Televisao.aumentaVolume();
		Televisao.aumentaVolume();
		System.out.println(Televisao.volume);
	}
	
}
