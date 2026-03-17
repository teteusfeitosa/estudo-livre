package exercicios.lista01;

import java.util.Scanner;

import exercicios.Questao;
/** 
 * Determine a área de um círculo de raio 5
*/

public class Questao06 extends Questao {

    public void processar() {

        Scanner scanner = new Scanner(System.in);
        Double pi = Math.PI;
        double raio = 5;
        double area = (raio * raio * pi); 
        System.out.println("área do círculo é : " + (area) + "cm²");

        scanner.close();

    }

}


   


