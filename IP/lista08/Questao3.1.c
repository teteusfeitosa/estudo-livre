#include <stdio.h>
/*
Faça um programa que, dados dois vetores bidimensionais (matrizes A e B) com dimensões de no máximo
5x5 elementos, retorne:
a. a soma destas duas matrizes
*/
int main (void){
    int l, c;
    printf ("Quantas linhas e colunas você quer?\n");
    scanf ("%d %d" ,&l ,&c);

    if (l != c){
        printf("Não é possível essa soma de matriz\n");
        return 1;
    }

    int matrizA[l][c];
    int matrizB[l][c];
    int matrizC[l][c];

    for (int i = 0; i < l; i++){
        for (int j = 0; j < c; j++){
            printf ("Coloque o valor da posição da matriz [%d][%d]\n",i,j);
            scanf ("%d" ,&matrizA[i][j]);
        }
    }

    for (int i = 0; i < l; i++){
        for (int j = 0; j < c; j++){
            printf ("Coloque o valor da posição da matriz [%d][%d]\n",i,j);
            scanf ("%d" ,&matrizB[i][j]);
        }
    }
    for (int i = 0; i < l; i++){
        for (int j = 0; j < c; j++){
            matrizC[i][j] = 0; // inicializando a matriz soma
        }
    }

    for (int i = 0; i < l; i++){
        for (int j = 0; j < c; j++){
            matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
        }
    }

    printf("\nA soma da matriz é\n");

    for (int i = 0; i < l; i++){
        for (int j = 0; j < c; j++){
            printf ("%d ", matrizC[i][j]);
        }
        printf("\n");
    }

    return 0;
}   