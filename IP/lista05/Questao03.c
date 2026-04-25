#include <stdio.h>
/*
Um programa que recebe uma nota de 0 a 100 e,
via switch-case (dica: divida por 10), atribui conceitos A, B, C, D ou F.
*/

int main(){
    int nota = 0;
    printf("Qual sua nota na prova?\n");
    scanf("%d",&nota);
    char conceito = '\0';
    char resultado = '\0'; 

    
    if(nota> 100 || nota < 0){
        printf("Não é possível essa nota\n");
    }           
    else{
        if(nota < 25){
            conceito = 'E';
        }    
        else if(nota >= 25 && nota < 30 ){
            conceito = 'D';
        }    
        else if(nota >= 30 && nota < 70){
            conceito = 'C';
        }    
        else if(nota >= 70 && nota <= 99){
            conceito = 'B';
        }    
        else if(nota == 100){
            conceito = 'A';
        } 
        switch (conceito){
            case 'A':
                resultado = conceito;
                break;
            case 'B':
                resultado = conceito;
                break;
            case 'C':
                resultado = conceito;
                break;
            case 'D':
                resultado = conceito;
                break;
            case 'E':
                resultado = conceito;
                break;                
            default:
                break;
        }
        printf("A sua categoria na prova é %c\n",resultado);
    }




    return 0;
}
