#include <stdio.h>
/*
*Escreva um programa que leia 4 números e mostre os números digitados
*pelo usuário e os mesmos números somados de 1.
*/
int main(){
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;

    
    printf("coloque um número aqui\n");
    scanf("%d",&a);

    printf("coloque um número aqui\n");
    scanf("%d",&b);

    printf("coloque um número aqui\n");
    scanf("%d",&c);

    printf("coloque um número aqui\n");
    scanf("%d",&d);

    a += 1;
    b += 1;
    c += 1;
    d += 1;

    printf("%d\n",a);
    printf("%d\n",b);
    printf("%d\n",c);
    printf("%d\n",d);

    return 0;
}