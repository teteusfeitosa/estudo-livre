package exercicios.lista01;

import java.util.Scanner;

import exercicios.Questao;
/* 
* Calcule a gorjeta de um garçom e atribua o valor total dessa conta acrescida da gorjeta
*/

public class Questao07 extends Questao {

    public void processar() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("despesa prévia é de:");
        double despesa = scanner.nextDouble();

        double percentualDaGorjeta = 0.1;
        double gorjetaDoGarçom = despesa * percentualDaGorjeta;
        double despesaTotal = (despesa + gorjetaDoGarçom );

        System.out.println("a gorjeta do garçom é: " + (gorjetaDoGarçom));

        System.out.println("valor da despesa acrescido com a gorjeta: " + (despesaTotal));

        scanner.close();

    }

}
