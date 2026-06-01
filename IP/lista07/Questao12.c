#include <stdio.h>
/*
Calcule a exponenciação de dois números inteiros x e y, onde y é o exponente de x, utilizando apenas
estruturas de repetição.
*/
int main(void){
    int x, y;
    printf ("Coloque um número e seu expoente(respectivmante)\n");
    scanf ("%d %d", &x, &y);
    int resultado = x;
    
    for (int i = 1; i < y; i++){
        resultado = resultado * x;   
    }
    printf ("O resultado dessa operação é %d\n", resultado);

    return 0;
}