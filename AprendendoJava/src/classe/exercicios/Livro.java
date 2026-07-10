package classe.exercicios;

public class Livro {
	String titular;
	String autor;
	int paginas;
	
	Livro(String titular,String autor,int paginas){
		this.titular = titular;
		this.autor = autor;
		this.paginas = paginas;
	}
	
	void exibirInformaçoes() {
		System.out.printf("O nome do autor é %s,o nome do livro é %s e a quantidade de páginas é %d\n",titular,autor,paginas);;
	}
}
