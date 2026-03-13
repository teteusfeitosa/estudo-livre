package exercicios.lista01;

import java.util.Scanner;

import exercicios.Questao;
/**
 * Calcule o salário mínimo, salário do cidadão referido e atribua quantas salários ele ganha unitariamente
 */
public class Questao02 extends Questao {

    public void processar(){
  
        Scanner scanner = new Scanner(System.in);
        System.out.print("qual valor do salário mínimo no brasil? ");
        double minimo = scanner.nextDouble();

        System.out.print("qual valor do seu salário? ");
        double salario = scanner.nextDouble();
        
        System.out.println("quantos salários mínimos vocẽ recebe? " + (salario / minimo));

        scanner.close();
    } 
    
}
