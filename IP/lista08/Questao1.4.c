#include <stdio.h>
/*
Faça um programa que dado o vetor unidimensional [2; 4; 35; 50; 23; 17; 9; 12; 27; 5] retorne:
subconjunto de valores primos que está contido no vetor
*/

int main() {

    int a[10] = {2, 4, 35, 50, 23, 17, 9, 12, 27, 5};

    printf("Numeros primos\n");

    for (int i = 0; i < 10; i++) {

        int primo = 1; //variável de controle;

        for (int j = 2; j < a[i]; j++) {

            if(a[i] % j == 0) {
                primo = 0;
                break;
            }
        }

        if (primo == 1 ) {
            printf ("%d\n", a[i]);
        }
    }

    return 0;
}