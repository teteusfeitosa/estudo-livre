#include <stdio.h>
/*
*Faça uma função que recebe a idade de um nadador por parâmetro e retorna , também por
parâmetro, a categoria desse nadador de acordo com a tabela abaixo:
*/
char categoria(int idade){

    if(idade >= 5 && idade <= 7){
        return 'A';
    }
    else if(idade <= 10){
        return 'B';
    }
    else if(idade <= 13){
        return 'C';
    }
    else if(idade <= 17){
        return 'D';
    }
    else if(idade >= 18){
        return 'E';
    }
    else{
        return '0'; // Não está na tabela
    }
}

int main(){
    int idade;

    printf("Quantos anos vocẽ tem?\n");
    scanf("%d",&idade);

    char categoriaN = categoria(idade);

    if(categoriaN == '0'){
        printf("Idade fora da categoria\n");
    }
        else{
        printf("Sua categoria é %c\n", categoriaN);
    }

    return 0;
}