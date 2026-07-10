package classe;

import java.util.Date;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data(01,01,70);
		
		
		Data d2 = new Data();
		
		
		Date hoje = new Date();
		
		System.out.println(hoje);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		
		d1.imprimirDataFormatada();
		
		
			
	}
}
