package exercicios.lista02;

import java.util.Scanner;

import exercicios.Questao;

public class Questao10 extends Questao {
    

    public void processar(){


        Scanner scanner = new Scanner(System.in);

        System.out.print("salário bruto : " );
        double salário = scanner.nextDouble();

        System.out.print("salário líquido : " );
        double líquido = scanner.nextDouble();


    
        System.out.println("desconto é " + (salário - líquido) );

        System.out.println("valor do empréstimo considerando a restrição que o valor a ser emprestado é 30% do salário líquido : " + (0.3 * líquido) );

        System.out.print("emprestimo desejado: ");
        double desejo = scanner.nextDouble();
        
    
        if(desejo  > (0.3 *líquido) ){
            System.err.println("que pena,você não pode fazer o empréstimo");

        }
        else{
            System.out.println("show vocẽ pode fazer o empréstimo");
        }

        scanner.close();



    }


}
