#include <stdio.h>
/*
Escreva um programa que mostre todos os números primos entre 1 e 100.
*/
int main (void){
    
    for (int n = 2; n <= 100; n++){
        int primo = 1;
        
        for (int i = 2; i < n; i++){

            if (n % i == 0){
                primo = 0;
                break;
            }
            
        }
        
    if (primo == 1){
        printf ("Seu número primo é %d\n", n);

    }

}
    return 0;

}
