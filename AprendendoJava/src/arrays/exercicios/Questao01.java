package arrays.exercicios;
/*
Faça um programa que dado o vetor unidimensional [2; 4; 35; 50; 23; 17; 9; 12; 27; 5] retorne:

 maior valor
*/
public class Questao01 {
    static void main(String...args) {
        int[] array = {2, 4, 35, 50, 23, 17, 9, 12, 27, 5};
        int maior = 0;

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
            if(array[i] > maior){
                maior = array[i];
            }
        }
        System.out.println(">>>>>>>>>>>>>>>>>");

        System.out.println("maior é " + maior);
    }
}
