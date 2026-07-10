package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b  = a;
		
		alteraPrimitivo(a);
		
		a++;
		b--;
		
		System.out.println(a);
		System.out.println(b);
		
		Data d1 = new Data(1,2,2026);
		Data d2 = new Data();
		d2 = d1; //atribuição por referência(tipo objeto);
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParavalorPadrao(d2); //mexeu na memória dos objetos
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
	}
	
	static void voltarDataParavalorPadrao(Data d) {
		d.dia = 1;
		d.ano = 1970;
		d.mes = 01;
	}
	
	static void alteraPrimitivo(double a) {
		a++;
	}
	
}
