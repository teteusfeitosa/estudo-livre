#include  <stdio.h>
//Faça um programa que receba 2 notas de um aluno, calcule a média e mostre se ele reprovou ou não (A média da escola é 6,0).
int main(){
    double n1,n2;

    printf("Quais foram as suas 2 notas?\n");
    scanf("%lf",&n1);
    scanf("%lf",&n2);

    double media = (n1 + n2)/2;

    if(media >= 6){
        printf("Você foi aprovado\n");
    }
    else{
        printf("Você foi reprovado\n");
    }
    printf("Sua média foi de %.2lf ",media);

    return 0;
}
