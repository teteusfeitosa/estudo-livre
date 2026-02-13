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
import exercicios.lista02.Questao13;
import exercicios.lista02.Questao14;
import exercicios.lista02.Questao15;
import exercicios.lista02.Questao16;
import exercicios.lista02.Questao17;
import exercicios.lista02.Questao18;


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
                break;
            case "4":
                questao = new Questao04();
                break;
            case "5":
                questao = new Questao05();
                break;
            case "6":
                questao = new Questao06();    
                break;
            case "7":
                questao = new Questao07();    
                break;
            case "8":
                questao = new Questao08();
                break;
            case "9":
                questao = new Questao09();
                break;
            case "10":
                questao = new Questao10();
                break;
            case "11":
                questao = new Questao11();
                break;
            case "12":
                questao = new Questao12();
                break;
            case "13":
                questao = new Questao13();
                break;
            case "14":
                questao = new Questao14();                            
                break;
            case "15":
                questao = new Questao15();    
                break;
            case "16":
                questao = new Questao16();
                break;
            case "17":
                questao = new Questao17();
                break;
            case "18":
                questao = new Questao18();                
                break;
            default:
                questao = new Questao01();
                break;
        }

        questao.processar();
        scan.close();
    }
}