#include <stdio.h>
#include <string.h>
//usando while loops,enquanto for true o while loop continua
/*
*do{
    printf("coloque um número maior que 0\n");
    scanf("%d",&num);

}while(num <= 0); ou seja cheque o código e dps entre no loop
*/
int main(){

    char nome [50] = "";
    
    printf("qual seu nome? \n");
    fgets(nome,sizeof(nome),stdin);
    nome[strlen(nome) -1] = '\0';

    while(strlen(nome) == 0){
        printf("não foi colocado o nome,por favor coloque seu nome:\n");
        fgets(nome,sizeof(nome),stdin);
        nome[strlen(nome) -1] = '\0';



    }
    printf("Olá %s\n",nome);

    return 0;

}




