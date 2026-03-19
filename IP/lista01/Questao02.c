#include <stdio.h>
//convertendo graus celsius para farenheit
int main(){
    double graus = 50;
    double farenheit = ((9 * graus) + 160);
    double divisao = farenheit/5; 
    
    printf("50 graus em celsius é quanto em farenheit? %0.2lf\n",divisao);
        
    return 0;
}