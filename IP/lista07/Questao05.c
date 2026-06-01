#include <stdio.h>
#include <math.h>
/*
Apresentar as potências de x, variando de 0 a 9. Deve ser considerado que qualquer número elevado a
zero é 1, e elevado a 1 é ele mesmo. x é fornecido pelo usuário.
*/
int main(){
    float x = 0, base;
    printf ("Coloque um número\n");
    scanf ("%f" ,&base);

    for(int i = 0; i < 10; i++){
        x = pow(base,i);
        printf ("O valor dessa potência de x é %.0f",x);
    }

    return 0;
}