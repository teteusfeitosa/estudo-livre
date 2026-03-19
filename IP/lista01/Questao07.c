#include <stdio.h>
// venda de produtos em 5 parcelas sem juros
int main(){
    char item [30] = "";
    double preço = 0;

    printf("qual item vocẽ quer comprar? ");
    fgets(item,sizeof(item),stdin);

    printf("qual valor desse item? ");
    scanf("%lf",&preço);

    printf("A forma de pagamento é parcelando em 5 vezes sem juros\n");

    double parcela5vezes = preço/5;

    printf("O valor de cada parcela será de %.2lfR$\n",parcela5vezes);

    return 0;
}