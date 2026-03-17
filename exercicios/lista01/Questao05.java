package exercicios.lista01;
import java.util.Scanner;


import exercicios.Questao;
/*
 * Calcule o valor da dívida final de um sujeito adicionado variavéis,como juros,percentual
*/

public class Questao05 extends Questao {


    public void processar() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("qual valor incial do débito: ");
        double debitoInicial = scanner.nextInt();
        
        System.out.print("quantidade de meses: ");
        double mes = scanner.nextDouble();
        
        System.out.print("taxa de juros:(de 0 a 1): ");
        
        double taxaDeJuros = scanner.nextDouble();
        double juros = (debitoInicial * taxaDeJuros * mes);

        
        System.out.println("valor da  dívida final: " + (debitoInicial + (juros) )  );
        
        
        
        

        








        scanner.close();




}







}
