package exercicios.lista02;
import java.util.Scanner;
/**
 * Coloque 2 nomes definidos e condicione que os 2 não possuam mesma idade,sabendo que o mais velho deve ser o primeiro a sair no output 
 */
import exercicios.Questao;

public class Questao20 extends Questao{
    public void processar(){
        Scanner scan = new Scanner(System.in);
        
        String nome1 = "lucas";
        
        String nome2 = "pedro";

        System.out.println("coloque a idade do " + nome1 + ":" );
        int idade1 = 0;
        idade1 = scan.nextInt();

        
        System.out.println("coloque a idade do " + nome2 + ":" );
        int idade2 = 0;
        idade2 = scan.nextInt();
      
        if(idade1 > idade2){          
        
            System.out.println("o rapaz mais velho é chamado " + nome1 + " tem " + idade1 + " anos" );
           
            System.out.println("o rapaz mais novo é chamado " + nome2 + " tem " + idade2 + " anos"  );        
            
        }
        else if(idade2 > idade1){
            System.out.println("o rapaz mais velho é chamado " + nome2 + " tem " + idade2 + " anos");
            
            System.out.println("o rapaz mais novo é chamado " + nome1 + " tem " + idade1+ " anos");        
           
        }
        else if(idade1 == idade2){
            System.out.println("operação inválida");
        }
        scan.close();





    
        





    }

}
