#include <stdio.h>
//Faça um programa que receba 3 números e coloque-os em ordem crescente.
int main(){
    int a,b,c;
    int x = 0;

    printf("Coloque 3 números\n");
    scanf("%d",&a);
    scanf("%d",&b);
    scanf("%d",&c);

    if(a > b){
        x = a;
        a = b;
        b = x;
    }
    if(a > c){
        x = a;
        a = c;
        c = x;
    }
    if(b > c){
        x = b;
        b = c;
        c = x;
    }

    printf("A ordem crescente será de %d %d %d\n",a,b,c);

    return 0;
}