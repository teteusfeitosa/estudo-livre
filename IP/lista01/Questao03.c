#include <stdio.h>
//conversão dólar para real
int main(){ 
    double quantidadeDolar = 0;
    double valorDe1Dolar = 5.64;

    
    printf("Quantos  dólares vocẽ possui?\n");
    scanf("%lf",&quantidadeDolar);
    
    printf("O valor de 1 dólar em reais é %.2lf\n",valorDe1Dolar);
    
    double valorTotal = quantidadeDolar * valorDe1Dolar;

    printf("Logo.você tem %.2lf reais",valorTotal);

    
    return 0;
}