package exercicios.lista01;

import java.util.Scanner;

import exercicios.Questao;


/**
 *  Determine qual é a idade que o usuário faz no ano atual. 
 * Para isso solicite o seu ano de nascimento e o ano atual.
 * 
 *  **/
public class Questao01 extends Questao {
 

    public void processar() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("estamos no ano: ");
        int ano = scanner.nextInt();

        System.out.print("em que ano vocẽ nasceu: ");
        int anoAntes = scanner.nextInt();

        System.out.println("sua idade é " + (ano - anoAntes)); 


        scanner.close();
        
    }
    
}
