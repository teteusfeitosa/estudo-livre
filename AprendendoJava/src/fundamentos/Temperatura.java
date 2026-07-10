package fundamentos;

public class Temperatura {
	
	public static void main (String [] args) {
		final int X = -32;
		final double FATOR = 5.0/9.0;
		double farenheit = -40;
		double celsius = (farenheit + X) * FATOR;
		System.out.println ("O resultado =" + celsius + "C." );
	}
}
