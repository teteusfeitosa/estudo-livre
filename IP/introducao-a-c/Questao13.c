#include <stdio.h>
#include <stdbool.h>
// Usando operadores lógicos
int main(){
//  & = and
//  || = or
//  ! = not Usando com boolean inverte o true p false ou false p true,ex: bool ensolarado = true; if(!ensolarado) = false
    int temperatura = 25;
    if(temperatura < 30 && temperatura > 0  ){
        printf("A temperatura está boa\n");
    }
    else{
        printf("A temperatura é muita ruim\n");
    }

    return 0;
}