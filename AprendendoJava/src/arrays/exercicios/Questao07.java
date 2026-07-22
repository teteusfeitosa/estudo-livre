package arrays.exercicios;

import java.util.Scanner;

/*
ofereça uma função que troque os valores contido no vetor pela seguinte política: cada
elemento i dentro do vetor será substituído pela soma de todos os (i-1) elementos mais o
elemento i. Por exemplo, dado um vetor [1; 2; 3; 4; 5] após a aplicação da função teríamos esse
vetor preenchido com os seguintes valores [1; 3; 6; 10; 15]. Para esta tarefa utilize um vetor
auxiliar.
*/
public class Questao07 {
    static int arrayAlterado(int array[],int novoArray[],int tamanho){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                novoArray[i] += array[j];
            }

        }
        return novoArray[tamanho - 1];
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos espaços de memória terá o array?");
        int tamanho = sc.nextInt();

        int array[] = new int[tamanho];
        int novoArray [] = new int[tamanho];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Coloque o valor do array na posição [%d]\n", i);
            array[i] = sc.nextInt();
        }
        Questao07.arrayAlterado(array,novoArray,tamanho);

        for (int j : novoArray) {
            System.out.print(j +" ");
        }
        sc.close();

    }
}
