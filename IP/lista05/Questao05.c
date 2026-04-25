#include <stdio.h>
/*
Receba um valor inteiro de saque. O programa deve
calcular a menor quantidade de notas de 100, 50, 20 e 10 necessárias.
*/
int main(){

    int saque;
    int qtNotas100 = 0,qtNotas50=0,qtNotas20=0,qtNotas10 = 0;
    int resto0 = 0,resto1=0,resto2=0,resto3=0;

    printf("Qual valor de saque inteiro?\n");
    scanf("%d",&saque);

    qtNotas100 = saque/100;
    resto0 = saque % 100;
    qtNotas50 = resto0 / 50;
    resto1 = resto0 % 50;
    qtNotas20 = resto1 / 20;
    resto2 = resto1 % 20; 
    qtNotas10 = resto2/10;
    resto3 = resto2 % 10;



    printf("A menor quantidade de notas do seu saque de notas de 100,50,20,10R$ = %d,%d,%d,%d\n",qtNotas100,qtNotas50,qtNotas20,qtNotas10);
    printf("O resto que não pode ser sacado é de %d\nR$",resto3);


    return 0;
}