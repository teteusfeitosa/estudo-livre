#include <stdio.h>
//Receba dois números e mostre qual é o maior.
int main(){
    int n1,n2;

    printf("Coloque o primeiro número\n");
    scanf("%d",&n1);

    printf("Coloque o segundo número\n");
    scanf("%d",&n2);

    if(n1 > n2){
        printf("O primeiro número é maior\n");
    }
    else if(n2 > n1){
        printf("O segundo número é maior\n");
    }
    else{
        printf("Os números são iguais\n");
    }



    return 0;
}