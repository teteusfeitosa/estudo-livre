package exercicios.lista01;

import java.util.Scanner;

import exercicios.Questao;

public class Questao07 extends Questao {

    public void processar() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("despesa prévia é de :");
        double despesa = scanner.nextDouble();

        double percentualDaGorjeta = 0.1;

        System.out.println("a gorjeta do garçom é: " + (percentualDaGorjeta * despesa));

        System.out.println("valor da despesa acrescido com a gorjeta: " + (despesa + (percentualDaGorjeta * despesa) ) );

        scanner.close();

    }

}
