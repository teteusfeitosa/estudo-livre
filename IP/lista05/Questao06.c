#include <stdio.h>
/*
Crie uma função que receba três números e retorne o maior deles sem
usar funções prontas da biblioteca math.h.
*/
int max(int n1,int n2,int n3){ 
    if(n1 > n2 && n1 > n3){
    return n1;
    }
    else if(n2 > n1 && n2 > n3){
    return n2;
    }
    else{
    return n3; 
    }
}

int main(){
    int n1 = 0,n2=0,n3=0;

    printf("Coloque 3 números\n");
    scanf("%d %d %d",&n1,&n2,&n3);

    int maior = max(n1,n2,n3);

    printf("O maior valor é o %d\n",maior);


    return 0;
}