package arrays.exercicios;

import java.util.Scanner;

/*
Faça um programa que, dados dois vetores bidimensionais (matrizes A e B) com dimensões de no máximo
5x5 elementos, retorne:
a. a soma destas duas matrizes
*/
public class Questao08 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] matrizSoma = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("A posição do array [%d][%d] qual valor?\n",i,j);
                matriz1[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("A posição do array  [%d][%d] qual valor?\n",i,j);
                matriz2[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(" %4d", matrizSoma[i][j]);
            }
            System.out.println();
        }




        sc.close();

    }
}
