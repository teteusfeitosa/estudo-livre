#include <stdio.h>
/*
Escreva um programa que solicita 5 números ao usuário e ao final mostre qual destes números é o
maior
*/
int main (void){
    int n = 0;
    int maior = 0, menor;
    menor = n; 
    
    for (int i = 0; i < 5; i++){
        printf ("Coloque 1 números\n");
        scanf ("%d", &n);


        if (n > maior){
            maior = n;
        }
        if (n < menor){
            menor = n;
        }

    }
    printf ("O maior número é %d\n",maior);
    printf ("O menor número é %d\n",menor);

    return 0;
}