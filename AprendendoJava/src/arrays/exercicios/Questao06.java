package arrays.exercicios;

import java.util.Scanner;

/*
ofereça uma função de pesquisa onde dado um valor inteiro qualquer de entrada retornar a
posição deste valor dentro do vetor, e caso este valor não esteja presente no vetor retornar –1.
*/
public class Questao06 {
    static int retornaPosicaoArray(int[] array, int valor){
        for (int i = 0; i < array.length; i++) {
            if(valor == array[i]){
                return i;
            }
        }
        return -1;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque a quantidade de termos do array");
        int tamanho = sc.nextInt();

        int array[] = new int[tamanho];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Coloque o valor do array");
            array[i] = sc.nextInt();
        }

        System.out.println("Coloque o termo que você quer buscar");
        int valor = sc.nextInt();

        System.out.println("O termo buscado fica na posição " + Questao06.retornaPosicaoArray(array,valor));
    }
}
