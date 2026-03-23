#include <stdio.h>
/*
Faça um algoritmo que calcule a quantidade de litros de combustível gasta em uma viagem,
utilizando um automóvel que faz 12Km por litro. O programa deve apresentar os valores da
velocidade média, tempo gasto na viagem, a distância percorrida e a quantidade de litros
utilizada na viagem.
*/
int main(){
    double kml = 12;
    double velocidade = 0;
    double tempoGasto = 0;
    
    printf("quantos km/h o carro está se locomovendo?\n");
    scanf("%lf",&velocidade); 
    
    printf("O veículo faz %.2lfkm/L\n",kml);
    
    printf("quanto tempo o veículo se manteve em movimento (em horas)?\n");
    scanf("%lf",&tempoGasto);
    
    double distanciaPercorrida = velocidade * tempoGasto;
    double litrosGastos = distanciaPercorrida/kml;
    printf("O gasto de combustível foi de %.2lf litros\n",litrosGastos);

    printf("A distância total percorrida foi de %.2lf km\n",distanciaPercorrida);
    
    return 0;
}