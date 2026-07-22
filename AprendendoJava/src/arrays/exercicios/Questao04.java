package arrays.exercicios;
/*
Faça um programa que dado o vetor unidimensional [2; 4; 35; 50; 23; 17; 9; 12; 27; 5] retorne:
subconjunto de valores primos que está contido no vetor
*/
public class Questao04 {
    static void main(String[] args) {
        int array [] = {2, 4, 35, 50, 23, 17, 9, 12, 27, 5};

        for (int i = 0; i < 10; i++) {
            Boolean primo = true;
            for(int j = 2; j < array[i]; j++){
                if(array[i] % j == 0){
                    primo = false;
                    break;
                }


            }

            if(primo){
                System.out.println(array[i]);
            }
        }
        for (int i = 2; i < 100; i++) {
            int primo = 1;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    primo = 0;
                    break;
                }
            }
            if(primo == 1){
                System.out.println(i);
            }
        }

    }
}
