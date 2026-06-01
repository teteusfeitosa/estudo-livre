#include <stdio.h>
/*
Escreva um programa que receba um valor e mostre os números pares de 0 até o valor recebido.
*/
int main(void){
    int num;
    printf ("Coloque um valor\n");
    scanf ("%d" ,&num);
    int i = 0;

    while(i <= num ){

        if(i % 2 == 0){
            printf("O número é %d\n",i);

        }
        i++;
    }
    return 0;
}