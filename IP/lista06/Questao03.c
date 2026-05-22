#include <stdio.h>
/*
Um professor, após obter informações de uma turma, deseja saber a média de idade. Escrever um
programa que lê as idades até que a idade lida seja zero, quando então é mostrada a média (o zero não é considerado
para a média). Para sair do programa o usuário deve digitar S.
*/
int main(){

    int idade, soma = 0;
    float media = 0;
    int qtd = 0;
    char op = '\0';
    

    while (op != 's'){
        printf ("Quantos anos vocẽ tem\n");
        scanf ("%d", &idade);

        if (idade > 0 && idade <= 110){
            qtd++;
            soma += idade;
            media = soma/qtd;   
        }
        printf ("Você deseja sair?\n(s para sair)\n");
        scanf (" %c", &op);    
    }

    printf ("sua média de idade será de %.1f\n", media);

    return 0;
}