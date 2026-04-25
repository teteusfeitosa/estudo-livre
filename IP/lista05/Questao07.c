#include <stdio.h>
/*
Receba dois tempos em minutos. O programa deve calcular a
diferença absoluta em segundos entre eles através de uma função que recebe parâmetros
por valor.
*/
int diff(int min1,int min2){
    int diferença = min2 - min1;

    if(diferença<0){
        diferença = (-diferença); 
    }
    return 60 * diferença;

}
int main(){
    int min1,min2;
    printf("Coloque os minutos do primeiro e do segundo\n");
    scanf("%d %d",&min1,&min2);



    int diferença = diff(min1,min2);

    printf("A diferença entre os tempos dos dois em segundos é de %d",diferença);




    return 0;
}