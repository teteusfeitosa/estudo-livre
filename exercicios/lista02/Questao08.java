package exercicios.lista02;

import java.util.Scanner;

import exercicios.Questao;

public class Questao08 extends Questao {

    public void processar() {

        Scanner scanner = new Scanner(System.in);

        double numerador = 0, denominador = 0;

        System.out.print("coloque o numerador do número racional: ");
        numerador = scanner.nextDouble();

        System.out.print("coloque o denominador do número racional: ");
        denominador = scanner.nextDouble();

        System.out.println("o número racional vai virar o valor de: " + (numerador / denominador) );

        if(denominador == 0){
            System.err.println("errou");
        }

        scanner.close();


    }
    
}
