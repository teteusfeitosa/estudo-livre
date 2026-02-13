package exercicios.lista02;
import java.util.Scanner;


import exercicios.Questao;

public class Questao20 extends Questao{
    public void processar(){
        Scanner scan = new Scanner(System.in);


        String nome1 = "lucas";

        String nome2 = "pedro";

        int idade1 = 20;
        int idade2 = 22;

      

        if(idade1 > idade2){          
        
            System.out.println("o primeiro rapaz chamado " + nome1 + " tem " + idade1 + " anos" );
           
        
            System.out.println("o segundo rapaz chamado " + nome2 + " tem " + idade2 + " anos"  );        
            
        }
        else if(idade2 > idade1){
            System.out.println("o primeiro rapaz chamado " + nome2 + " tem " + idade2 + " anos");
            
            System.out.println("o segundo rapaz chamado " + nome1 + " tem " + idade1+ " anos");        
           
        }
        else if(idade1 == idade2){
            System.out.println("operação inválida");
        }



    
        





    }

}
