package exercicios;

import java.util.Scanner;

import exercicios.lista01.Questao01;
import exercicios.lista01.Questao02;
import exercicios.lista01.Questao03;
import exercicios.lista01.Questao04;
import exercicios.lista01.Questao05;
import exercicios.lista01.Questao06;
import exercicios.lista01.Questao07;
import exercicios.lista02.Questao08;
import exercicios.lista02.Questao09;
import exercicios.lista02.Questao10;
import exercicios.lista02.Questao11;
import exercicios.lista02.Questao12;


public class Principal {

    public static void main(String...args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Que questao vc quer executar?");
        String idQuestao = scan.next();
        Questao questao;

        switch (idQuestao) {
            case "1":
                questao = new Questao01();
                break;
            case "2":
                questao = new Questao02();
                break;
            case "3":
                questao = new Questao03();
            case "4":
                questao = new Questao04();
            case "5":
                questao = new Questao05();
            case "6":
                questao = new Questao06();    
            case "7":
                questao = new Questao07();    
            case "8":
                questao = new Questao08();
            case "9":
                questao = new Questao09();
            case "10":
                questao = new Questao10();
            case "11":
                questao = new Questao11();
            case "12":
                questao = new Questao12();                    
                break;
            default:
                questao = new Questao01();
                break;
        }

        questao.processar();
        scan.close();
    }
}