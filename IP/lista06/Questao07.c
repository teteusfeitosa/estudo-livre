#include <stdio.h>
/*
– Fazer um programa que leia a quantidade de linhas e colunas de uma matriz e a desenhe com o caractere
que o usuário escolher. Ex: lin = 2, col = 2, char = *
*/
int main(void){
    int linha, coluna;
    char caractere;

    printf ("Coloque a quantidade de linhas\n");
    scanf ("%d", &linha);

    printf ("Coloque a quantidade de colunas\n");
    scanf ("%d", &coluna);

    printf ("Coloque um caractere\n");
    scanf (" %c", &caractere);

    printf ("\nA sua matriz será assim\n");

    for (int i = 0; i < linha; i++){
        for (int j = 0; j < coluna; j++){
            printf ("%c", caractere);
        }
        printf ("\n");
    }
    return 0;
}