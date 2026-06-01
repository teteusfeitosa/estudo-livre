#include <stdio.h>
/*
Dado um número X digitado pelo usuário, calcule o fatorial de x (x!). Exemplo: 5! é igual
a 5 . 4 . 3 . 2 . 1 que é igual a 120, assim como 4! é igual a 4 . 3 . 2 . 1 que é igual a 24, como 3! é igual
a 3 . 2 . 1 que é igual a 6 e que 2! é igual a 2 . 1 que é igual a 2
*/
int main(void){

    int fat = 0;
    int n;
    printf("Qual fatorial vocẽ quer exibir?\n");
    scanf("%d",&n);
    fat = n;

    for(int i = 1; i<n; i++){
        fat = fat * i;

    }
    printf("Seu fatorial é de %d\n",fat);

    return 0;
}