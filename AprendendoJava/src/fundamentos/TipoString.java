package fundamentos;



public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		String s = "Boa tarde"; // String é imutável;
		s = s.toUpperCase();
		System.out.println(s.concat("! ! !"));
		System.out.println(s + "! ! !");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("BOA"));
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("Boa tarde"));
		
		int idade = 25;
		float dinheiro = 20000;
		
		//String frase = String.format // Igual ao printf
		
		System.out.printf("Ele tem %d anos e possui %.2fR$\n",idade, dinheiro);
		System.out.println("Frase qualquer".substring(6,10	));
	}
}
