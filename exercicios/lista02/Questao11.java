package exercicios.lista02;

import java.util.Scanner;

import exercicios.Questao;

public class Questao11 extends Questao  {

    public void processar(){
        Scanner scanner = new Scanner(System.in);

        int cidadao = 0;
        System.out.print("sua idade é de: ");
        cidadao = scanner.nextInt();

        if(cidadao < 16){
            System.out.println("você está abaixo da idade permitida para votar,visto que possui menos de 16 anos");
        }
        else if (cidadao >= 16 && cidadao < 18 || cidadao >= 65) {
            System.out.println("voto facultativo");

        }
        else{
            System.out.println("você é obrigado a votar");
        }


        
        
        
        scanner.close();
        
    }
    
}
