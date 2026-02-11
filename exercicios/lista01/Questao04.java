package exercicios.lista01;

import java.util.Scanner;

import exercicios.Questao;

public class Questao04 extends Questao {
    public void processar() {
     
        Scanner scanner = new Scanner(System.in);
        
    
        double nota1=0,nota2=0,nota3=0,nota4=0;
    
        System.out.println("coloque suas 4 notas avaliativas: " + (nota1 + nota2 + nota3 + nota4));
    
        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();
        nota3 = scanner.nextDouble();
        nota4 = scanner.nextDouble();
        
        System.out.println("sua média é: " + ((nota1 + nota2 + nota3 + nota4)) / 4);
    
        scanner.close();
    
}
    
}
