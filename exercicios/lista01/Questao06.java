package exercicios.lista01;

import java.util.Scanner;

import exercicios.Questao;

public class Questao06 extends Questao {

    public void processar() {

        Scanner scanner = new Scanner(System.in);
        Double pi = Math.PI;
        double raio = 5;
        System.out.println("área do círculo é : " + (raio * raio * pi) + "cm^2");

        scanner.close();

    }

}


   


