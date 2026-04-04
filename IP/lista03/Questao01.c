#include <stdio.h>
/*
Faça um programa com um Menu em que o usuário possa escolher uma das
quatro operações matemáticas para calcular. Receba dois números digitados pelo
usuário e dependendo da opção que o usuário escolher, faça o cálculo.
*/

int main(){
    float n1 = 0;
    float n2 = 0;
    char operador = '\0';

    printf("coloque o primeiro número\n");
    scanf("%f",&n1);

    printf("coloque a operação\n");
    scanf(" %c",&operador);

    printf("Coloque o segundo número\n");
    scanf("%f",&n2);

    float resultado;

    if(operador == '+'){
        resultado = n1 + n2;
    }
    else if(operador == '-'){
        resultado = n1 - n2;
    }
    else if(operador == '*'){
        resultado = n1 * n2;
    }
    else if(operador == '/'){
        if(n2 == 0){
            printf("essa operação é inválida");
        }
        else{
            resultado = n1 / n2;
        }
    }

    printf("O resultado da sua operação será de: %+.2f\n",resultado);

    return 0;
}