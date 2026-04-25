#include <stdio.h>
#include <math.h>
/*
* Faça uma função que recebe por parâmetro o raio de uma esfera e calcula o seu volume
  (V = 4/3 π r3).
*/

float volumeEsfera(float raio){
    float pi = 3.1415;
    float volume = 4.0/3.0 * pi * pow(raio,3);
    return volume; 
}

int main(){
    float volume = 0,raio = 0;

    printf("Coloque o valor do raio\n");
    scanf("%f",&raio);

    volume = volumeEsfera(raio);

    printf("O valor do volume da esfera é de %.2fcm²",volume);

    return 0;
}