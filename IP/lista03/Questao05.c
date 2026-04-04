#include <stdio.h>
//Leia a altura de duas pessoas e mostre quem é o mais alto.
int main(){
    float altura1,altura2;

    printf("Qual altura do primeiro indivíduo?(em metros) ");
    scanf("%f",&altura1);

    printf("Qual altura do segundo indivíduo?(em metros) ");
    scanf("%f",&altura2);

    if(altura1 > altura2){
        printf("O primeiro indivíduo é mais alto\n");
    }
    else if(altura2 > altura1){
        printf("O segundo indivíduo é o mais alto\n");
    }
    else{
        printf("Altura é igual entre os dois\n");
    }

    return 0;
}