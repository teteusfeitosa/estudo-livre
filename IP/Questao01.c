#include <stdio.h>
//fazendo o consumo médio de um veículo
int main(){
    double consumo = 10;    
    double distancia = 100; 
    double consumomedio = distancia / consumo;

    printf("seu consumo médio será de %.2lfkm/l\n",consumomedio);
    
    return 0;
}