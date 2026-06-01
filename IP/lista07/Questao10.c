#include <stdio.h>
/*
Faça um programa que calcula a associação em paralelo de dois resistores R1 e R2 digitados pelo
usuário. O programa fica pedindo estes valores e calculando até que o usuário entre com um valor de
resistência igual a zero. Fómula: R=R1*R2/(R1+R2).
*/
int main (void){
    float r1, r2, r;

    do{

        printf ("Coloque o valor de r1 e r2\n");
        scanf ("%f %f" ,&r1, &r2);

        r = (r1 * r2) / (r1 + r2);


        printf("O valor da req é %.0f\n",r);

    }while (r != 0);

    return 0;
}