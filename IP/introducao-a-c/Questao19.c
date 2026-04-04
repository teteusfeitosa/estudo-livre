#include <stdio.h>
//Contando números de pares e ímpares.
int main(){
    int par = 0;
    int impar = 0;
    char op = 's';
    int n = 0;

    while(op == 's' || op =='S'){
        printf("Coloque um dígito\n");
        scanf("%d",&n);

        if(n % 2 == 0){
            par++;
        }
        else{
            impar++;
        }
        printf("Deseja continuar(S = sim ou s = sim)\n");
        scanf(" %c",&op);        

    }
    printf("total de pares é de %d\n",par);
    printf("O total de iḿpares é de %d\n",impar);




    return 0;
}