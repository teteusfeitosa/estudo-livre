#include <stdio.h>
/*
Uma empresa de pesquisa resolveu entrevistar os torcedores do estado do Rio de Janeiro para saber
qual a maior torcida. Fazer um programa que leia um número não conhecido de respostas do time que
torce: N para Fluminense, M para Flamengo, V para Vasco, B para Botafogo ou O para Outros. O
programa deve encerrar quando for digitado R - Resultado. Escrever ao final o total de torcedores
entrevistados, a quantidade de entrevistados por time e a porcentagem em relação ao total.
*/
int main (void){
    char time = '\0';
    float fla = 0, flu = 0, vas = 0, bot = 0, qtd = 0, outros = 0;

    do{
        printf ("Qual time vocẽ torce(maiúsculo)?\n");
        scanf (" %c", &time);

        if (time == 'N'){
            flu++;
            qtd++;
        }
        else if (time == 'M'){
            fla++;
            qtd++;
        }
        else if (time == 'V'){
            vas++;
            qtd++;
        }
        else if (time == 'B'){
            bot++;
            qtd++;            
        }
        else if (time == 'O'){
            outros++;
            qtd++;
        }

        
    }while (time != 'R');

    printf ("O total de torcedores foi de %.0f\n", qtd);
    printf ("Quantidade de flamenguistas foi de %.0f e percentual foi de %.0f%\n",fla,fla/qtd * 100);
    printf ("Quantidade de fluminenses foi de %.0f e percentual foi de %.0f%\n",flu,flu/qtd * 100);
    printf ("Quantidade de botafoguenses foi de %.0f e percentual foi de %.0f%\n",bot,bot/qtd * 100);
    printf ("Quantidade de vascainos foi de %.0f e percentual foi de %.0f%\n",vas,vas/qtd * 100);
    printf ("Quantidade de torcedores de outros times foi de %.0f e percentual foi de %.0f%\n",outros,outros/qtd * 100);

    return 0;
}