#include <stdio.h>
//Leia o peso de duas pessoas e mostre quem é o mais pesado.
int main(){
    float peso1,peso2;

    printf("Qual peso do primeiro indivíduo?(em kilos) ");
    scanf("%f",&peso1);

    printf("Qual peso do segundo indivíduo?(em kilos) ");
    scanf("%f",&peso2);

    if(peso1 > peso2){
        printf("O primeiro indivíduo é mais pesado\n");
    }
    else if(peso2 > peso1){
        printf("O segundo indivíduo é  mais pesado\n");
    }
    else{
        printf("O peso é igual entre os dois\n");
    }





    return 0;
}