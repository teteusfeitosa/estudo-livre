#include <stdio.h>
/*
int i = 10;

    while(i >= 1){
        printf("%d\n",i); Estrutura básica do while
        i--;
    }

*/
/*
int n,soma = 0;
    
    printf("digite  números(0 para parar)\n");
    scanf("%d",&n);

    while(n != 0){
        soma = soma + n;
        printf("digite  números(0 para parar)\n");
        scanf("%d",&n);
    }
    
    printf("Soma = %d\n",soma);
somador básico de while
*/
/*
int n;
    char opcao = 's';

    
    while(opcao == 'S' || opcao == 's'){
        printf("Coloque um número aqui\n");
        scanf("%d",&n);

        if(n % 2 == 0){
            printf("par\n");
        }
        else{
            printf("Ímpar\n");          verificador de ímpar ou par
        }
        printf("Deseja continuar digitando?\n");
        scanf(" %c",&opcao);
    }
*/
/*
int idade = 0;

    printf("Qual a sua idade?\n");
    scanf("%d",&idade);

    while(idade < 0){
        printf("Por favor,coloque sua idade real\n");
        scanf("%d",&idade);
    }
    printf("Sua idade é de %d anos\n",idade);
*/
int main(){
    int i = 1;
    int a = 0;
    printf("Escolha um número pra fazer tabuada\n");
    scanf("%d",&a);

    while(i<=10){
        int c = a * i;
        printf("%d x %d = %d \n",a,i,c);
        i++;
    }
    
    
    return 0;
}