#include <stdio.h>
/*
*Escreva uma função que recebe as 3 notas de um aluno por parâmetro e uma letra. Se a
letra for A a função calcula a média aritmética das notas do aluno, se for P, a sua média
ponderada (pesos: 5, 3 e 2) e se for H, a sua média harmônica. A média calculada também
deve retornar por parâmetro.
*/
double mediaAritmetica(double n1,double n2, double n3){
    double result = (n1 + n2 + n3)/3;
    return result;
   
}
double mediaPonderada(double n1,double n2,double n3){
    double resultado = (5 * n1 + 3 * n2 + 2 * n3)/10;
    return resultado;
}
double mediaHarmonica(double n1,double n2,double n3){
    double results = 3.0/(1.0/n1 + 1.0/n2 + 1.0/n3);
    return results;
}
int main(){
    double n1,n2,n3;
    char opcao = '\0';

    printf("Coloque suas 3 notas aqui\n");
    scanf("%lf",&n1);
    scanf("%lf",&n2);
    scanf("%lf",&n3);

    printf("Qual será a o tipo de média escolhida(A = média normal, P = ponderada,H = harmônica)?\n");
    scanf(" %c",&opcao);

    double resultado = 0;

    if(opcao =='A'){
        resultado = mediaAritmetica(n1,n2,n3);
    }
    else if(opcao == 'P'){
        resultado = mediaPonderada(n1,n2,n3);
    }
    else if(opcao == 'H'){
         resultado = mediaHarmonica(n1,n2,n3);
         if(n1 == 0 && n2 == 0 && n3 == 0 ){
            printf("Essa divisão não é possível\n");
            resultado = 0;
         }
    }
    else{
        printf("Opcção inválida\n");
    }

    printf("Sua média será de %.2lf",resultado);


    return 0;
}