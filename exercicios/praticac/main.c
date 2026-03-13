#include <stdio.h>
#include <stdbool.h> 

int main(){
    float pib = 20.22435;
    float preço = 23.25;
    float temperatura = -10;
    bool estaOnline = true;
    int idade = 23;
    float vida = 63.3;
    double money = 2000;
    char cifra = '$';
    char nome []  = "meu nome é lucas";

    printf("minha idade é %d\n", idade );
    printf("minha vida é %.3f\n", vida );
    printf("eu tenho %.2lf reais\n", money );
    printf("qual seu nome? %s\n", nome);
    
    printf("o pib é %.3f\n", pib ); 
    printf("preço do feijão é %.2f\n", preço );
    printf("a temperatura é %.2f graus celsius\n", temperatura);

    if(estaOnline){
        printf("vocẽ tá online\n");
    
    }
    else{
        printf("você não está online\n");
    }       




    return 0;       
} 