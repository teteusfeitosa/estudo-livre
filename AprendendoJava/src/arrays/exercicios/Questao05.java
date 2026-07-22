package arrays.exercicios;

import java.util.Scanner;

/*
leia 7 valores inteiros e os armazene em um vetor. Listar o vetor com as referidas posições de
armazenamento de cada valor.
*/
public class Questao05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array [] = new int[7];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Coloque um valor");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            String s = String.format("A posição do vetor é [%d], e seu valor armazenado é %d\n",i, array[i]);
            System.out.print(s);
        }
    }


}
