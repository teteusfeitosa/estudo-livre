package arrays.exercicios;
/*
Faça um programa que dado o vetor unidimensional [2; 4; 35; 50; 23; 17; 9; 12; 27; 5] retorne:
média dos valores
*/
public class Questao02 {
    static void main(String[] args) {
        int[] array = {2, 4, 35, 50, 23, 17, 9, 12, 27, 5};
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.println("A média será " + (double)total/10);

    }

}
