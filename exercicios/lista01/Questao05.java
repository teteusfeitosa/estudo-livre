package exercicios.lista01;
import java.util.Scanner;


import exercicios.Questao;


public class Questao05 extends Questao {


    public void processar() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("qual valor incial do débito: ");
        double debito = scanner.nextInt();
        
        System.out.print("quantidade de meses: ");
        double mes = scanner.nextDouble();
        
        System.out.print("taxa de juros: ");
        
        double taxaDeJuros = scanner.nextDouble();
        
        System.out.println("valor da  dívida final: " + (debito + (debito * taxaDeJuros * mes) )  );
        
        
        
        

        








        scanner.close();




}







}
