#include <stdio.h>
#include <math.h>
//Elabore um programa que lê três valores e calcula a média
//geométrica dos números lidos.
int main(){
    double a = 0;
    double b = 0;
    double c = 0;
    double x = 0;
    
    
    printf("coloque 3 valores: \n");
    scanf("%lf",& a);
    scanf("%lf",& b);
    scanf("%lf",& c);
    
    
    double media1 = (a * b * c);
    media1 = pow(media1,1.0/3.0); 
    printf("Sua média geométrica será de: %.2lf",media1);

    return 0;
}