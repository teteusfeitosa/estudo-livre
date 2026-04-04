#include <stdio.h>
//Receba os valores das laterais de um quadrilátero e diga se é um quadrado ou não.
int main(){
    int comprimento,largura;

    printf("Coloque o valor em cm da largura\n");
    scanf("%d",&largura);

    printf("Coloque o valor em cm do comprimento\n");
    scanf("%d",&comprimento);

    if(comprimento == largura){
        printf("O quadrilátero é um quadrado\n");
    }
    else{
        printf("Esse quadrilátero não é um quadrado\n");
    }





    return 0;
}