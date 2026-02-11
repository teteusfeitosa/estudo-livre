package exercicios.lista02;

import java.util.Scanner;

import exercicios.Questao;

public class Questao09 extends Questao {


    public void processar() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("qual sua idade? ");
        int idade = scanner.nextInt();


        if(idade >= 18){
            System.out.println("you're an adult ");
        }
        
        else{
            System.out.println("you aren't an adult ");
        }

    }
    



}
