#include <stdio.h>
// faça matriz transposta;
int main (void){
    int l, c;

    printf ("Quantas linhas da matriz\n");
    scanf ("%d" ,&l);

    printf ("Quantas colunas da matriz\n");
    scanf ("%d" ,&c);

    int matrizA[l][c];

    for(int i = 0; i < l; i++){
        for (int j = 0; j < c; j++){
            printf("Coloque os valores da matriz [%d][%d]\n",i,j);
            scanf("%d",&matrizA[i][j]);
        }
    }

    printf("\nA matriz transposta será\n");

    for(int i = 0; i < c; i++){
        for(int j = 0; j < l; j++){
            printf("%d ",matrizA[j][i]);
        }
        printf("\n");
    }


    return 0;
}