#include <stdio.h>
//Receba um número e mostre se ele é par ou ímpar.
int main(){
    int n1 = 0;

    printf("Coloque o primeiro número\n");
    scanf("%d",&n1);
    
    int modulo = n1 % 2;

    //if(n1 % 2 == 0) evita criação de uma variável

    if(modulo == 0){
        printf("seu número é par\n");
    }
    else{
        printf("O número é ímpar\n");
    }

    return 0;
}