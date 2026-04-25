#include <stdio.h>
/*
Implemente uma função que recebe um ano por parâmetro
e retorna 1 se for bissexto e 0 caso contrário, utilizando expressões lógicas complexas
(&& e ||).
*/
int anoBissexto(int ano){
    if( (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0) ){
        return 1;
    }
    else{
        return 0;
    }
}

int main(){
    int ano = 0;
    printf("Coloque um ano aleatório:\n");
    scanf("%d",&ano);

    int buscaBissexto = anoBissexto(ano);

    printf("O retorno será bissexto (sendo 1,caso n será 0),nesse caso é %d\n",buscaBissexto);





    return 0;
}