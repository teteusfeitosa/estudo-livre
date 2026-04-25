#include <stdio.h>
/*
Receba um valor inteiro em segundos e converta para o
formato HH:MM:SS.
*/
int main(){
    int h=0,m=0,s,total = 0;

    printf("Coloque um valor qualquer de segundos\n");
    scanf("%d",&total);

    if(total > 24 * 3600){
        printf("Não há conversão\n");
    }
    else{
        h = total/3600;
        total %=  3600;
        m = total/60;
        s = total % 60;
        printf("seu número inteiro convertido no formato padrão de horas ficará %0.2d:%0.2d:%0.2d\n",h,m,s);
    }

    return 0;
}