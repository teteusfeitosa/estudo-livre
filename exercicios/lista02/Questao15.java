package exercicios.lista02;

import exercicios.Questao;

public  class Questao15 extends Questao {
    public void processar(){

        int me = 2, dia = 5;
        String mes = "fevereiro";

        
        if(me < 1 || me > 12){
            System.out.println("data inválida");
        }
        else if(dia < 1 || dia > 30){
            System.out.println("data inválida");
        }

        else{
            System.out.println("seu aniversário é no dia " + dia + " e no mês " + mes + " datando no dia " + dia + " do mês " + me  );

        }
        
        






    }






        
        
        
        

    }
    

