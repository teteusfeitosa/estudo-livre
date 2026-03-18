#include <stdio.h>
#include <math.h>
/*
* calculando juros compostos a partir de dados do usuário
*/
int main(){
    double capital = 0;
    double i = 0;    
    int mes = 0;
    
    
    printf("quantos meses a dívida acumulou de juros? ");
    scanf("%d", & mes);
    
    printf("qual foi o valor inicial da dívida a ser paga? ");
    scanf("%lf", & capital);
    
    printf("qual valor da taxa de juros (de 0 a 1)? ");
    scanf("%lf", & i);
    
    double juros = (1 + i);
    double elevado = pow(juros, mes);
    double montante = (capital * (elevado));

    if(i>1){
        printf("não é possível fazer essa operação ");
    }
    else{
        printf("o valor devido da dívida será de %.2lfR$\n ", montante);

    }
        
    return 0;
}