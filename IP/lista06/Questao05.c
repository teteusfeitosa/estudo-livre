#include <stdio.h>
/*
Escrever um programa que produza a saída abaixo na tela, para N linhas e usando um
caractere lido do teclado (no exemplo, *). Após mostrar uma vez, o programa repete o processo, só parando quando
N for zero.
**
****
******
*/
int main(void){
    char carac = '\0';
    int linha;
    printf ("Qual caractere vocẽ deseja?\n");
    scanf (" %c", &carac);

    printf ("Quantas linhas você deseja?\n");
    scanf ("%d", &linha);

    for(int j = 1; j <= linha; j++){
        for(int i = 0; i < j * 2 ; i++){
            printf("%c",carac);
        }
        printf("\n");

    }
    return 0;
}