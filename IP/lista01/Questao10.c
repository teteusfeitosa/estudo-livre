#include <stdio.h>
/*
que dados o valor da hora trabalhada, o percentual de descontos e as
horas trabalhadas por um funcionário, apresente os valores de: Horas trabalhadas, Salário
Bruto, Desconto, Salário Líquido.
*/
int main(){
    float valorDaHora = 0;
    float horasTrabalhada = 0;
    int diasTrabalho = 0;
    
    printf("Qual valor da hora trabalhada em reais?\n");  
    scanf("%f",&valorDaHora);
    
    printf("Quantas horas de trabalho?\n");  
    scanf("%f",&horasTrabalhada);
    
    printf("Quantos dias trabalhados no mês?\n");  
    scanf("%d",&diasTrabalho);
    if(diasTrabalho>31){
        printf("Essa operação é impossível");
    }
    else{
        double salariobruto = valorDaHora * horasTrabalhada * diasTrabalho;
        
        printf("O seu salário bruto é de %.2lfR$\n",salariobruto);
        
        double desconto = 0.1 * salariobruto;

        printf("O total de desconto é de %.2lfR$\n",desconto);
        
        double liquido = salariobruto - desconto;

        printf("O seu salário líquido será de %.2lfR$\n",liquido);
    }  
    return 0;
}