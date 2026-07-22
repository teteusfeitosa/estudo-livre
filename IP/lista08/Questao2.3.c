#include <stdio.h>
/*
ofereça uma função que troque os valores contido no vetor pela seguinte política: cada
elemento i dentro do vetor será substituído pela soma de todos os (i-1) elementos mais o
elemento i. Por exemplo, dado um vetor [1; 2; 3; 4; 5] após a aplicação da função teríamos esse
vetor preenchido com os seguintes valores [1; 3; 6; 10; 15]. Para esta tarefa utilize um vetor
auxiliar.
*/
int main() {
    int n;
    printf("Quantos valores no vetor você quer?\n");
    if (scanf("%d", &n) != 1 || n <= 0) return 1; // Proteção básica contra entradas inválidas

    int v[n];
    int a[n];

    
    for(int i = 0; i < n; i++){
        a[i] = 0; 
    }

    
    for(int i = 0; i < n; i++){
        printf("Coloque o valor da posição [%d] do array\n", i);
        scanf("%d", &v[i]);
    }

    
    for(int i = 0; i < n; i++){
        for(int j = 0; j <= i; j++){
            a[i] += v[j];
        }
    }

    
    printf("\nValores do array após a troca\n");
    for(int i = 0; i < n; i++){
        printf("%d\n", a[i]);
    }

    return 0;
}
