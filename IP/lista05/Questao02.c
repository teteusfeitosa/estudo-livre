#include <stdio.h>
/*
Crie um programa que converta uma temperatura de
Celsius para Kelvin ou Fahrenheit usando switch-case para a escolha. Utilize constantes
para os fatores de conversão.
*/
int main(){
    float celsius = 0;
    float resultado = 0;

    int escolha = 0;

    printf("Coloque um valor em graus celsius\n");
    scanf("%f",&celsius);

    printf("Escolha o número 1 ou 2(1 para kelvin e 2 para farenheit)\n");
    scanf("%d",&escolha);

    switch(escolha){
        case 1:
            resultado = celsius + 273;
            printf("os graus celsius equivalem a %.2f",resultado);
            break;
        case 2:
            resultado = ((9.0/5.0 * celsius) + 32);
            printf("os graus celsius equivalem a %.2f",resultado);
            break;   
        default:
            resultado = 0;     
    }

    return 0;
}