package exercicios.lista01;

import java.util.Scanner;

import exercicios.Questao;

public class Questao03 extends Questao {

    public void processar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("quantos homens na faculdade? ");
        double homem = scanner.nextDouble();

        System.out.print("quantas mulhers na faculdade? ");
        double mulher = scanner.nextDouble();

        System.out.println("percentual de homens: " + (homem / (homem + mulher) * 100 ) + "%");
        System.out.println("percentual de mulheres " + (mulher / (homem + mulher) * 100 + "%" ));
        

        scanner.close();   
     }
    
}
