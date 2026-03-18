#include <stdio.h>
//preço de custo e valor de venda de mercadoria
int main(){
    double preçoCusto = 0;
    char item [30] = "";
    double valor = 0;
    
    printf("qual produto vocẽ quer comprar? ");
    fgets(item,sizeof(item),stdin);
    
    printf("O preço de custo desse item é ");
    scanf("%lf",&preçoCusto);
    
    printf("qual valor desse produto? ");
    scanf("%lf",&valor);
    
    double valorReal = valor * 1.1;

    if(preçoCusto >= valor){
        printf("Esse produto não existe\n");
    }
    else{
        printf("Esse produto é vendido por %.2lfR$,mas devido a reajustes o valor será de %.2lf\n",valor,valorReal);
    }        
    return 0;
}