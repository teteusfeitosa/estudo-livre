package arrays.exercicios;
/*
Faça um programa que dado o vetor unidimensional [2; 4; 35; 50; 23; 17; 9; 12; 27; 5] retorne:
os valores dispostos em ordem crescente
*/
public class Questao03 {
    static void main(String[] args) {

        int array [] = {2, 4, 35, 50, 23, 17, 9, 12, 27, 5};
        int permuta = 0;

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9 - i; j++){
                if(array[j] > array[j + 1]){
                    permuta = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = permuta;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }

    }
}
