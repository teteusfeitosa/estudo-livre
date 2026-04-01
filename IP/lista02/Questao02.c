#include <stdio.h>
//Escrever um programa que lê três notas inteiras e calcula a sua
//média aritmética.
int main(){
    double a1 = 0;
    double a2 = 0;
    double a3 = 0;

    
    printf("coloque sua primeira nota\n");
    scanf("%lf",&a1);
    
    printf("coloque sua segunda nota\n");
    scanf("%lf",&a2);
    
    printf("coloque sua terceira nota\n");
    scanf("%lf",&a3);
    
    double media = (a1 + a2 + a3)/3;
    printf("sua média é de %.2lf\n",media);

    return 0;
}