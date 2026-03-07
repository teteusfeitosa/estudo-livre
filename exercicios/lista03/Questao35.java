package exercicios.lista03;

import java.util.Scanner;

public class Questao35 {     
    /**
     * Exiba uma tabuada atribuída pelo usuário.
     */
    public static void main(String...args) {    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Coloque um número aqui: ");
        int x = sc.nextInt();
            
        for(int i = 1; i <= 10; i = i + 1) {
            System.out.println(x + " x " + i +  " = " + (x * i));
                    
        }
        
        sc.close();
  
    }    

}
