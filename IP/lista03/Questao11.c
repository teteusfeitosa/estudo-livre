#include <stdio.h>
/*
Para doar sangue é necessário ter entre 16 e 69 anos. Faça um programa que
pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não.
*/
int main(){
    char op = '\0';
    int idade = 0;
    
    printf("Você quer doar sangue(S = sim, s = sim)?\n");
    scanf(" %c",&op);

    if(op == 'S' || op == 's'){
        printf("Qual sua idade?\n");
        scanf("%d",&idade);

        if(idade >= 16 && idade <= 69){
            printf("você pode doar sangue\n");
        }
        else{
            printf("Você não pode doar sangue\n");
        }        
    }
    else{
        printf("Você escolheu não doar sangue\n");
    }

    return 0;
}