#include <stdio.h>
/*
Apresentar todos os números divisíveis por 4 que sejam menores que 200.
*/
int main(){
    for (int i = 0; i < 200; i++){
        if (i % 4 == 0){
            printf ("%d\n",i);
        }
    }
    return 0;
}