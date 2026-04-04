#include <stdio.h>
/*
Faça um programa que calcule o IMC de uma pessoa e mostre como ela está. Use
os valores: Abaixo de 18,49 - Abaixo do peso; Entre 18,5 e 24,99 - Peso normal;
Acima de 25 - Acima do peso.
*/

int main(){
    double peso = 0;
    printf("Qual seu peso em kilos?\n");
    scanf("%lf",&peso);

    double altura = 0;
    printf("Qual sua altura em metros?\n");
    scanf("%lf",&altura);

    double IMC = (peso/(altura * altura));

    if(IMC < 18.49){
        printf("Vocẽ está abaixo do peso\n");
    }
    else if(IMC >= 19.5 && IMC <= 24.99){
        printf("Você está com peso normal\n");
    }
    else{
        printf("Você está acima do peso\n");
    }
    
    printf("Seu IMC é de %.2lf\n",IMC);

    return 0;
}