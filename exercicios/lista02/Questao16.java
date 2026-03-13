package exercicios.lista02;

import exercicios.Questao;
/* 
* Acrescente ao exercício anterior o trimestre que o sujeito nasceu
*/

public class Questao16 extends Questao {


    public void processar(){
          
        int mes = 2, dia = 5;
        int trimestre = 1;
        
        String nomeDoMes = "fevereiro";
                
        if(mes< 1 || mes > 12){
            System.out.println("data inválida");
        }
        else if(dia < 1 || dia > 30){
            System.out.println("data inválida");
        }

        else{
            System.out.println("seu aniversário é no dia " + dia + " e no mês " + nomeDoMes + " datando no dia " + dia + " do mês " + mes);
            System.out.println("vocẽ nasceu no " + trimestre  + " trimestre");

        }
       





    }
    
}
