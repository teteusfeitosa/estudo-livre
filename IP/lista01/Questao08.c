#include <stdio.h>
//padrões númericos,exemplo;27 e 99 dão 27,descubra esse padrão e generalize
int main(){
    int num1 = 0;
    int num2 = 0;

    printf("coloque 2 números a seguir :\n");
    scanf("%d",&num1);
    scanf("%d",&num2);

    int soma = (num1 /10) +  (num1 % 10) + (num2 /10) + (num2 % 10);

    printf("Resultado : %d\n",soma);

    return 0;
}