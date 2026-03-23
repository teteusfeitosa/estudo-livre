#include <stdio.h>
#include <string.h>
// usando funções = reutilizavel código

void felizAniversário(char nome [],int idade){
    printf("\nParabéns para vocẽ\n");
    printf("nessa data querida\n");
    printf("muitas felicidades\n");
    printf("e muitos anos de vida\n");
    printf("é big,é big %s\n",nome);
    printf("vocẽ acaba de completar %d anos\n",idade);

}
int main(){
    char nome [50] = "";
    int idade = 0;

    printf("coloque seu nome: ");
    fgets(nome,sizeof(nome),stdin);
    nome[strlen(nome) -1 ] = '\0';

    printf("coloque sua idade: ");
    scanf("%d",&idade);
        
    felizAniversário(nome , idade); 
    // Em ordem dos parâmetros p/ n/ dar erro

    return 0;
}