#include <stdio.h>
/*
Fazer um programa que desenha uma pirâmide, usando comandos de repetição.
       X
      XXX
     XXXXX
    XXXXXXX
   XXXXXXXXX
  XXXXXXXXXXX
 XXXXXXXXXXXXX
*/

int main(void) {

    int linhas;

    printf ("Quantas linhas da piramide? ");
    scanf ("%d", &linhas);

    for (int i = 1; i <= linhas; i++) {

        for (int espaco = 1; espaco <= linhas - i; espaco++){
            printf (" ");
        }

        for (int j = 1; j <= (2 * i - 1); j++) {
            printf ("*");
        }

        printf ("\n");
    }

    return 0;
}
