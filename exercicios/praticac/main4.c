/*
* Brincando no output e input
*/


#include <stdio.h>
#include <string.h>

int main(){
    int idade = 0;
    double tamanhoDaPeça = 0;
    float pib = 0;
    char nome [30] = "";

    printf("coloque sua idade: ");
    scanf("%d", &idade);

    printf("coloque o tamanho da sua peça: " );
    scanf("%lf", &tamanhoDaPeça);

    printf("qual pib do Brasil? " );
    scanf("%f", &pib );

    //printf("Qual seu nome completo? ");
    //scanf("%s", &nome ); n suporta espaços
    getchar();
    printf("qual seu nome completo: ");
    fgets(nome,sizeof(nome),stdin );
    nome[strlen(nome) -1 ] = '\0';

    printf("%d\n", idade );
    printf("%.2lf\n", tamanhoDaPeça );
    printf("%.2f\n", pib );
    printf("%s\n", nome );
    


    return 0;
}