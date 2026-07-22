#include <stdio.h>
/*
Faça um programa para receber do usuário a dimensão de um vetor (máx. 20), os elementos desse vetor e
efetuar a sua ordenação utilizando o método da bolha (bubble-sort).
*/
int main (void){
    int num;
    printf ("Quantos números dentro do array você quer?\n");
    scanf ("%d",&num);
    if (num > 20 || num <= 0){
        printf("Número inválido\n");
        return 0;
    }
    int v[num];
    int x = 0;

    for (int i = 0; i <= 19; i++){
        printf ("Coloque um valor da posição [%d] do array\n" ,i);
        scanf ("%d" ,&v[i]);
    }

    for (int i = 0; i < 19; i++){

        for (int j = 0; j < (19 - i); j++){
            if (v[j] > v[j+1]){
                x = v[j];
                v[j] = v[j+1];
                v[j+1] = x;
            }
        }
    }
    printf ("\nO array ordenado é: ");

    for(int i = 0; i <= 19; i++){
        printf("%d ",v[i]);
    }
    printf("\n");

    return 0;
}