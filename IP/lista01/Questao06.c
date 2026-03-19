#include <stdio.h>
//rendimento de um valor em um mês
int main(){
    double valor = 0;

    printf("qual valor você quer colocar pra render ?");
    scanf("%lf",&valor);
    double percentual = 0.007;

    double valorRendido = percentual * valor;
    double total = valorRendido + valor;

    printf("o valor total após o rendimento é de %.3lfR$\n",total);

    return 0;
}