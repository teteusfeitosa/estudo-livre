#include <stdio.h>
/*
Faça um programa que, para um número indeterminado de Pessoa: leia a idade de cada pessoa,
sendo que a leitura da idade 0 (zero) indica o fim dos dados e não deve ser considerada; calcule e
mostre o número de Pessoa; calcule e mostre a idade média do grupo; calcule e mostre a menor
idade e a maior idade.
*/
int main (void){


    int idade = 0, qtd = 0, maior = 0, menor, soma = 0;
    float media = 0;
    menor = idade;

    do{
        printf("Qual idade vocẽ tem?\n");
        scanf("%d", &idade);

        if(idade > 0){
            qtd++;
            soma += idade;
            if(idade > maior){
                maior = idade;
        
            }
            if(idade < menor){
                menor = idade;
        
            }
            media = soma/qtd;
        }
    }while (idade != 0);

    printf ("A quantidade de Pessoa foi de %d\n", qtd);
    printf("A média de idade é de %.2f\n", media);
    printf("A maior idade foi de %d anos\n", maior);
    printf("A menor idade foi de %d anos\n", menor);

    return 0;
}