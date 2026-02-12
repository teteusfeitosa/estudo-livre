package exercicios.lista02;
import java.util.Scanner;

import exercicios.Questao;

public class Questao12 extends Questao {

    public void processar(){
        Scanner scanner = new Scanner(System.in);
        double nota1 = 0, nota2 = 0, nota3 = 0;

      

        System.out.println("coloque suas 3 notas aqui de 0 a 10");
        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();
        nota3 = scanner.nextDouble(); 

        double media = ((nota1 + nota2 + nota3)) / 3;



        System.out.println("sua média é de " + media );

        if(media >= 7){
            System.out.println("parabéns,você foi aprovado");
        }
        else if(media >= 5 && media < 7){
            System.out.println("você ficou na média de recuperação");
        }
        else{
            System.out.println("que pena, você foi reprovado");
        }
        
        scanner.close();

    }

    
    
}
