#include  <stdio.h>
/*
Faça uma função que recebe, por parâmetro, a hora de início e a hora de término de um
jogo, ambas subdivididas em 2 valores distintos: horas e minutos. A função deve retornar,
também por parâmetro, a duração do jogo em minutos, considerando que o tempo máximo
de duração de um jogo é de 24 horas e que o jogo pode começar em um dia e terminar no
outro.
*/

int duracaoJogo(int horaIn, int minutoIN, int horaFim, int minutoFim){
    
    int inicio = horaIn * 60 + minutoIN;
    int fim = horaFim * 60 + minutoFim;

    int duracao = fim - inicio;

    // se virou o dia
    if(duracao < 0){
        duracao += 24 * 60;
    }

    return duracao;
}



int main(){
    int horaIn,horaFim,minutoIn,minutoFim;



    printf("Qual horário inicial(horas e minutos)\n");
    scanf("%d  %d",&horaIn, &minutoIn);

    printf("Qual horário final(horas e minutos)\n");
    scanf("%d  %d",&horaFim, &minutoFim);

    int duracao = duracaoJogo(horaIn,minutoIn,horaFim,minutoFim);

    printf("A duração do jogo foi de %d minutos\n",duracao);



    return 0;
}