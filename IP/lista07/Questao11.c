#include <stdio.h>
/*
Faça um programa que receba um número do teclado e calcule a soma de todos os números de 1 até
ele. Exemplo: o usuário digita 7, o programa vai mostrar 28, pois: 1+2+3+4+5+6+7=28
*/
int main(void){
    int soma = 0, num;

    printf ("Coloque a quantidade de número que quer\n");
    scanf("%d", &num);

    for (int i = 1; i <= num; i++){
        soma += i;
    }
    printf("-------------------------\n");
    printf ("A sua soma é %d\n", soma);

    return 0;
}