#include <stdio.h>
//custo de fábrica de um carro e informe o custo ao consumidor
int main(){
    double custoFabrica = 100000; 
    double imposto1 = (0.45 * custoFabrica);
    
    
    printf("O custo do carro de fábrica é de %.2lfR$\n",custoFabrica);
    
    double custoDoCarro = imposto1 + custoFabrica;
    double distribuidor = 0.28 * custoDoCarro;     
    double imposto2 = 0.45 * distribuidor;
    double valorFinal = custoDoCarro + imposto2 + distribuidor;
    
    printf("O valor de venda é de %.2lf\n",valorFinal);
    
    
    return 0;
}