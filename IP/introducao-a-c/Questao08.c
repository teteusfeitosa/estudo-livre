#include <stdio.h>
#include <math.h>
/*
* calculando volume,área da esfera e área do círculo 
*/
int main(){
    const double pi = 3.1415; 
    double raioc = 0;
    
    printf("qual valor do raio do círculo: ");
    scanf("%lf",& raioc);
    
    double areaCirculo = (pi * (raioc * raioc));
    printf("o valor da área será de %lfcm²\n", areaCirculo );

    double raioe = 0;
    printf("qual valor do raio da esfera: ");
    scanf("%lf", & raioe);
    
    double cubo = raioe * raioe * raioe; 
    double volumeEsfera = ((4.0 / 3.0) * pi * cubo);
    printf("o volume da esfera é %lfcm²\n",volumeEsfera );

    double raioQuadrado = raioe * raioe;
    double areaEs = 4 * pi * raioQuadrado;
    
    printf("qual valor da área da esfera sabendo do raio já dado pelo usuário?\n %lfcm²\n", areaEs);
        
    return 0;

}