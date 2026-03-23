#include <stdio.h>
//calculadora com switch
int main(){
    char operador = '\0';
    double n1 = 0.0;
    double n2 = 0.0;
    double resultado = 0.0;

    printf("coloque o primeiro número: ");
    scanf("%lf",&n1);

    printf("coloque o operador(+,*,/,-): ");
    scanf(" %c",&operador);
    
    printf("coloque o segundo número: ");
    scanf("%lf",&n2);

    switch(operador){
        case '+':
            resultado = n1 + n2;
            break;
        case '-':
            resultado = n1 - n2;
            break;
        case '*':
            resultado = n1 * n2;
            break;
        case '/':
            if(n2 == 0){
                printf("essa operação é indefinida");
            }
            else{
                resultado = n1 / n2;
            }
            break;
        default:
            printf("Essa operação não é válida\n");

    }
    printf("o resultado dessa sua operação é de %.2lf\n",resultado);
    
    return 0;
}