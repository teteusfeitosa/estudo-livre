#include <stdio.h>
#include <math.h>
/*
*Faça uma função que recebe por parâmetro os valores necessários para o cálculo da
fórmula de báskara e mostra, as suas raízes, caso seja possível calcular.
*/
float raiz1(float a,float b, float c){
    float delta = pow(b,2) - 4 * a * c;
    float raiz1_ = (- b + sqrt(delta))/ (2 * a);
    if(delta < 0){
        return 0;
    }
    else{
        return raiz1_;
    }
    
}

float raiz2(float a,float b,float c){
    float delta = pow(b,2) - 4 * a * c;
    float raiz2_ = (-b  - sqrt(delta)) / (2 * a);
    if(delta < 0){
        return 0;
    }
    else{
        return raiz2_;
    }
    
}
int main(){

    float a = 0,b = 0,c = 0;

    printf("coloque os parãmetros de a,b e c da equação do segundo grau:\n");
    scanf("%f",&a);
    scanf("%f",&b);
    scanf("%f",&c);

    float primeiraRaiz = raiz1(a,b,c);
    float segundaRaiz = raiz2(a,b,c);
    
    if(primeiraRaiz == 0 || segundaRaiz == 0){
        printf("não existe raiz real\n");
    }
    else{
        printf("As raízes da sua função são %.2f e %.2f",primeiraRaiz,segundaRaiz);
    }    
    return 0;
}
