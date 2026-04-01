#include <stdio.h>
/*
Uma conta telefônica é composta pelos seguintes custos:
• Assinatura básica: R$ 49,90 (inclui ligações ilimitadas para fixos locais e uma
franquia de dados)
• Pacote adicional de dados (opcional): R$ 20,00 por 5GB adicionais
• Ligações internacionais (opcional): R$ 1,50 por minuto
• Serviços de streaming (opcional):
o Plataforma A: R$ 15,00/mês
o Plataforma B: R$ 25,00/mês
o Plataforma C: R$ 30,00/mês
*/
int main(){
    double minuto = 0;
    double pacote = 0;
    double opcao = 0;
    char op = '\0';
    
    printf("o plano básico custa 49.90R$\n");
    printf("Vocẽ quer assinar o plano básico telefônico? (S = sim N = não)\n");
    scanf("%c",&op);
    double total = 49.90;
    if(op == 's'|| op == 'S'){
        printf("Cada pacote de 5GB custa 20R$\n");
        printf("Quantos pacotes você vai querer?\n");
        scanf("%lf",&pacote);
        total += pacote * 20;
    
        printf("O custo por minuto de ligação é de 1.5R$\n");
        printf("Quantos minutos de ligações internacionais vai querer?\n");
        scanf("%lf",&minuto);
        total += minuto * 1,5;

        printf("qual streaming você quer (1=a,2=b,3=c)\n");
        scanf("%lf",&opcao);

        if(opcao == 1){
            total += 15;
            printf("o preço dessa streaming é de 15R$\n");
        }
        else if(opcao == 2){
            total += 20;
            printf("o preço dessa streaming é de 20R$\n");
        }
        else if(opcao == 3){
            total += 30;
            printf("o preço dessa streaming é de 30R$\n");
        }

        printf("O custo total foi de %.2lfR$\n",total);




    }
    else{
        printf("seu custo é zero\n");
    }
    
   
    return 0;
}