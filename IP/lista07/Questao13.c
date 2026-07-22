#include <stdio.h>
/*
Escreva um programa que lê o tamanho do lado de um quadrado e imprime um quadrado daquele
tamanho com asteriscos.
*/
int main (void){
    int tamanho;

    printf ("qual tamanho do quadrado?\n");
    scanf ("%d", &tamanho);

    for (int i = 1; i <= tamanho; i++){
        for (int j = 1; j <= tamanho; j++){
            printf ("*");
        }
        printf ("\n");
    }

    return 0;
}