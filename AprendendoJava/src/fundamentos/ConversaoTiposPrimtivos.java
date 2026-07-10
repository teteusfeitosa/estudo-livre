package fundamentos;

public class ConversaoTiposPrimtivos {
	public static void main(String[] args) {
		double a = 1; // implícita
		System.out.println(a);
		
		float b = (float) 1.123; //float b = 1.0F; // conversão explícita == cast
		System.out.println(b);
		
		int c = 100;
		byte  d = (byte)c; // explícita cast
		System.out.println(d);
		
		double e = 1;
		int f = (int)e; // explícita
		System.out.println(f);
		
		
		
	}
}
