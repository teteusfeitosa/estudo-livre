package exercicios.lista03;

import java.util.Scanner;

public class Questao34 {
    /**
     * exiba 50 números aleátorios entre 1 a 100
     */
    public static void main(String...args) {    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Coloque um número aqui: ");
    
        for(int i = 1; i <= 50; i++) {
            int numero = (int) (Math.random() * 100) + 1;
            System.out.println(numero);                    
        }
        
        sc.close();
  
    }    

}
