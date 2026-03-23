#include <stdio.h>
#include <stdbool.h>
// Usando estruturas de condicão aninhadas
int main(){
    float preço = 10;
    bool estudante = false; //desconto de 10%if
    bool idoso = false; // desconte de 20% 
    //Estudante paga 9 reais
    //Idoso paga 8 reais
    //Idoso e estudante paga 7 reais
    if(estudante){
        if(idoso){
            printf("você recebeu desconto de 30%\n");
            preço *= 0.7;
        }
        else{
            printf("vocẽ recebeu desconto de 10%\n");
            preço *= 0.9;
        }
    }
    else{
        if(idoso){
            printf("vocẽ recebeu desconto de 20%\n");
            preço *= 0.8;
        }
    }

    printf("o valor do ingresso será de %.2fR$\n",preço);
    
    
    
    
    return 0;
    }


