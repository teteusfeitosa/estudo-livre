#include <stdio.h>
#include <stdbool.h>
//protótipo de função

void oi(char nome[],int idade);//protótipo de função
bool idadeCheck(int idade);

int main(){

    oi("lucas",30);

    if(idadeCheck(30)){
        printf("você já está apto a trabalhar\n");
    }
    else{
        printf("vocẽ n atingiu a idade\n");
    }

    return 0;
}
void oi(char nome[],int idade){
    printf("olá %s\n",nome);
    printf("vocẽ tem %d anos\n",idade);
}

bool idadeCheck(int idade){
    if(idade >= 16){
        return true;
    }
    else{
        return false;
    }


}