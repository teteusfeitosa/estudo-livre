#include <stdio.h>
/*
ofereça uma função de pesquisa onde dado um valor inteiro qualquer de entrada retornar a
posição deste valor dentro do vetor, e caso este valor não esteja presente no vetor retornar –1.
*/
int busca (int v[], int tamanho, int valor){
    for(int i = 0; i < tamanho; i++){
        if(v[i] == valor){
            return i;
        }
    }
    return -1;
}
int main (void){
    int v[10] = {1,2,3,4,5,6,7,8,9,10};

    int numero;

    printf ("Digite um numero: \n");
    scanf ("%d" ,&numero);

    int posicao = busca(v, 10, numero);

    if(posicao == -1){
        printf("Valor não encontrado\n");
    }
    else{
        printf("Valor encontrado na posição %d\n",posicao);
    }

    return 0;
}