package exercicios.lista02;

import java.util.Scanner;

import exercicios.Questao;

public class Questao19 extends Questao {

    public void processar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("coloque 2 números em ordem crescente: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(num1 > num2 ){
            System.out.println("operação inválida");
        }
        else if(num1 == num2){
            System.out.println("operação inválida");
        }

        scanner.close();




    }
    
}
