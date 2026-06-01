#include <stdio.h>
/*
Apresentar o total do somatório dos X primeiros números inteiros, X sendo definido pelo usuário e X
tem que ser menor que 500.
*/
int main(void){
    int soma = 0, x;

    printf ("Quantos números vocẽ quer?\n");
    scanf ("%d",&x);

    if (x < 500 ){
        for (int i = 0; i <= x; i++){
            soma += i;
        }
        printf ("A soma total é de %d\n",soma);
    }
    else{
        printf("Quantidade de números inválidos\n");
    }
    return 0;
}