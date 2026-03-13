/*
* Fazendo lista de compra
*/

#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int main(){
    char item[50] = "";
    char moeda = '$';
    float preço = 0;
    int quantidade = 0;
    float total = 0;

    printf("Qual item você quer comprar: ");
    fgets(item,sizeof(item),stdin);

    printf("quantos você vai querer: ");
    scanf("%d", &quantidade);

    printf("o preço desse item é: ");
    scanf("%f", &preço);

    total = quantidade * preço;

    printf("o total foi de R%c%.2f\n ",moeda, total);









    return 0;
}