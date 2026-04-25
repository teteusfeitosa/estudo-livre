#include <stdio.h>
// Usando o switch
int main(){

    int diaDaSemana = 0;

    printf("coloque um número de 1-7 para achar o dia da semana\n");
    scanf("%d",&diaDaSemana);

    switch(diaDaSemana){
        case 1:
            printf("Hoje é segunda\n");
            break;
        case 2:
            printf("Hoje é terça\n");
            break;        
        case 3:
            printf("Hoje é quarta\n");
            break;
        case 4:
            printf("Hoje é quinta\n");
            break;
        case 5:
            printf("Hoje é sexta\n");
            break;
        case 6:
            printf("Hoje é sábado\n");
            break;
        case 7:
            printf("Hoje é domingo\n");
            break;
        default:
            printf("coloque apenas números de (1-7)\n");    
    }
        
    return 0;
}