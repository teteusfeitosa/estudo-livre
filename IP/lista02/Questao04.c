#include <stdio.h>
//Implemente um programa que lê três valores e calcule a média
//ponderada para pesos 1, 2 e 3, respectivamente
int main(){
    double a = 0;
    double b = 0;
    double c = 0;

    printf("coloque suas 3 notas: \n");
    scanf("%lf",&a);
    scanf("%lf",&b);
    scanf("%lf",&c);

    double peso = (a + (b * 2) + (c * 3));
    double media = peso/6;

    printf("Sua média será de: %0.2lf\n",media);

    return 0;
}