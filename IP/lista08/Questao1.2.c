#include <stdio.h>
/*
Faça um programa que dado o vetor unidimensional [2; 4; 35; 50; 23; 17; 9; 12; 27; 5] retorne:
média dos valores
*/
int main (void){

    int a [10] = {2, 4, 35, 50, 23, 17, 9, 12, 27, 5};
    float soma = 0;

    for (int i = 0; i < 10; i++){
        soma += a[i];
    }
    printf("A média será de %.2f\n", soma/10);

    return 0;
}