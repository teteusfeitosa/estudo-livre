#include <stdio.h>
/*
O critério de notas de uma faculdade consiste de uma nota de 0 a 10 em
cada bimestre, sendo a primeira nota peso 2 e a segunda peso 3. Elabore um programa
que lê as notas bimestrais e calcula a nota do semestre.
*/


int main(){
    double nota1 = 0;
    double nota2;

    printf("Qual foi sua nota do primeiro bimestre? \n");
    scanf("%lf",&nota1);

    printf("Qual foi sua nota do segundo bimestre? \n");
    scanf("%lf",&nota2);

    double peso = ((2 * nota1) + (3 * nota2));
    double media = peso/5;

    printf("A nota do semestre é %.2lf\n",media);

    return 0;
}