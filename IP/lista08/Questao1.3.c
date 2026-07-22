#include <stdio.h>
/*
Faça um programa que dado o vetor unidimensional [2; 4; 35; 50; 23; 17; 9; 12; 27; 5] retorne:
os valores dispostos em ordem crescente
*/
int main (void){

     int a [10] = {2, 4, 35, 50, 23, 17, 9, 12, 27, 5};
     int x = 0;
      //jeito melhor usando algoritmo de buble sort.
     for (int i = 0; i < 9; i++){
      for (int j = 0; j < 9 - i; j++){
         if (a[j] > a[j+1]){
            x = a[j];
            a[j] = a[j+1];
            a[j+1] = x;
         }
      }
     }
     printf("O resultado da ordenação de vetores é\n");

     for(int i = 0; i < 10; i++){
      printf("%d\n",a[i]);
     }

    return 0;
}