#include <stdio.h>
/*
Faça um programa que dado o vetor unidimensional [2; 4; 35; 50; 23; 17; 9; 12; 27; 5] retorne:

a. maior valor
*/

int main (void){

    int a [10] = {2, 4, 35, 50, 23, 17, 9, 12, 27, 5};
    int maior = 0;

    for (int i = 0; i < 10; i++){
        if (a[i] > maior){
            maior = a[i];
        }

    }
    printf ("O maior valor é %d\n", maior);

    return 0;
}