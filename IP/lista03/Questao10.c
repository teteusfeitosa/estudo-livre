#include <stdio.h>
// Escrever um programa que lê três notas inteiras e calcula a sua média aritmética.
int main(){
    int n1,n2,n3;
    
    printf("Coloque 3 notas inteiras que você tirou na prova\n");
    scanf("%d",&n1);
    scanf("%d",&n2);
    scanf("%d",&n3);
    
    int somatorio = n1 + n2 + n3;
    int media = somatorio/3;
    
    if(somatorio % 3 == 0){
        printf("Sua média inteira é de %d,media\n",media);
    }
    else{
        printf("A média não é inteira\n");
    }    

    return 0;
}