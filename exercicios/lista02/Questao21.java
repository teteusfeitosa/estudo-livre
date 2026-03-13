package exercicios.lista02;
import java.util.Scanner;

import exercicios.Questao;
/*
* Defina um empréstimo pra cada funcionário da empresa
* Sabe-se que na diretoria empréstimo é 30% do salário,25% na gerência e 20% no operacional
*/

public class Questao21 extends Questao {
    public void processar(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual salário do diretor: ");
        double diretor = scan.nextDouble();

        System.out.println("Qual salário do gerente: ");
        double gerente = scan.nextDouble();

        System.out.println("Qual salário de um operador: ");
        double operador = scan.nextDouble();

        System.out.println("Qual valor empréstimo desejado pelo diretor: ");
        double emDiretor = scan.nextDouble();

        System.out.println("Qual valor do empréstimo desejado pelo gerente: ");
        double emGerente = scan.nextDouble();

        System.out.println("Qual valor do empréstimo desejado pelo operador: ");
        double emOperador = scan.nextDouble();

        double limiteDiretor = 0.3 * diretor, limiteGerente = 0.25 * gerente, limiteOperador = 0.2 * operador;

        if(emDiretor > limiteDiretor ) {
            System.out.println("não pode fazer esse empréstimo");
        }
        else{
            System.out.println("O diretor vai receber " + emDiretor );
        }
        if(emGerente > limiteGerente){
            System.out.println("não pode fazer esse empréstimo");
        }
        else{
            System.out.println("O gerente vai receber " + emGerente );
        }
        if(emOperador > limiteOperador){
            System.out.println("não pode fazer esse empréstimo" );
        }
        else{
            System.out.println("O operador vai receber " + emOperador );
        }
        scan.close();

        }

    }
    

