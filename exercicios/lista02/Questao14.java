package exercicios.lista02;
import java.util.Scanner;

import exercicios.Questao;

public  class Questao14 extends Questao {
    public void processar(){
        Scanner scanner = new Scanner(System.in);
        
        String mes;
    
        System.out.print("digite o nome de um mẽs: ");
        mes = scanner.nextLine();

        if(mes.equals("janeiro")){
            System.out.println("mês 1");    
        }
        else if(mes.equals("fevereiro")){
            System.out.println("mês 2");    
        }
        else if(mes.equals("março")){
            System.out.println("mês 3");    
        }
        else if(mes.equals("abril")){
            System.out.println("mês 4");    
        }
        else if(mes.equals("maio")){
            System.out.println("mês 5");    
        }
        else if(mes.equals("junho")){
            System.out.println("mês 6");    
        }
        else if(mes.equals("julho")){
            System.out.println("mês 7");    
        }
        else if(mes.equals("agosto")){
            System.out.println("mês 8");    
        }
        else if(mes.equals("setembro")){
            System.out.println("mês 9");    
        }
        else if(mes.equals("outubro")){
            System.out.println("mês 10");    
        }
        else if(mes.equals("novembro")){
            System.out.println("mês 11");    
        }
        else if(mes.equals("dezembro")){
            System.out.println("mês 12");    
        }
        else
            System.out.println("mês não existente"); 
        
        

        scanner.close();



        }
        
        
        
        

    }
    

