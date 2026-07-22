#include <stdio.h>
/*
Faça um programa que junte os 3 exercícios acima. Ele repetidamente oferece um menu com a opção
0 para terminar e outras 3 opções 1, 2 e 3, cada uma correspondendo a um tipo de figura. Caso a opção indicada
pelo usuário seja inválida, é mostrada uma mensagem apropriada. Em todos os casos exceto 0 o menu é oferecido
novamente.
*/
int main(void){
    int escolha;
    do{
        printf ("Coloque um número de 1 a 3 e 0 para repetir a pergunta\n");
        scanf ("%d" ,&escolha);

        if (escolha < 0 || escolha > 3){
        printf ("Número digitado foi inválido\n");
    }

        switch (escolha){
            case 1:
                char carac = '\0';
                int linha;
                printf ("Qual caractere vocẽ deseja?\n");
                scanf (" %c", &carac);

                printf ("Quantas linhas você deseja?\n");
                scanf ("%d", &linha);

                for (int j = 1; j <= linha; j++){
                    for (int i = 0; i < j * 2; i++){
                        printf ("%c", carac);
        
                    }
                    printf ("\n");
        
                }
                break;
            case 2:
                int linhas;

                printf ("Quantas linhas da piramide? ");
                scanf ("%d", &linhas);

    // controla as linhas
                for (int i = 1; i <= linhas; i++) {
                    

                    for (int espaco = 1; espaco <= linha - i; espaco++){
                        printf (" ");
                    }

        // imprime os *
                    for (int j = 1; j <= (2 * i - 1); j++) {
                        printf("*");
        
                    }

                    printf ("\n");
    
                }
                break;
            case 3:
                    int coluna;
                    char caractere;

                    printf ("Coloque a quantidade de linhas\n");
                    scanf ("%d", &linha);

                    printf ("Coloque a quantidade de colunas\n");
                    scanf ("%d", &coluna);

                    printf ("Coloque um caractere\n");
                    scanf (" %c", &caractere);

                    printf ("\nA sua matriz será assim\n");

                    for (int i = 0; i < linha; i++){
                        for (int j = 0; j < coluna; j++){
                            printf ("%c", caractere);
        
                        }
                        printf ("\n");
    
                    }
                break;
        }
    }while (escolha != 0);

    printf ("Você não está mais na brincadeira\n");

    return 0;
}