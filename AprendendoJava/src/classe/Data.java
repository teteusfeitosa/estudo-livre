package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(int dia,int mes,int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1,1,1970);
	}
	
	String obterDataFormatada() {
		return String.format("%02d/%02d/%02d" ,dia, mes, ano); 
		
	}
	void imprimirDataFormatada() {
		System.out.printf("%02d/%02d/%02d" ,dia, mes, ano); // não é muito flexível
	}
}
