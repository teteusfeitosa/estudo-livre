#include <stdio.h>
/*
leia 7 valores inteiros e os armazene em um vetor. Listar o vetor com as referidas posições de
armazenamento de cada valor.
*/
int main (void){
    int v[7];
        
    for (int i = 0; i < 7; i++){
        printf ("Coloque o valor %d termo\n" ,i + 1);
        scanf ("%d" ,&v[i]);
    }

    for (int j = 0; j < 7; j++){
        printf ("A posicão do vetor %d é e o valor é %d\n" ,j,v[j]);
    }

    return 0;
}