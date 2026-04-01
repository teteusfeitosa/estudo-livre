//Testando declarações de retorno = return statements
#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int multiplicar(int num){ //se mudar o tipo de dados,muda mo parâmetro tbm: se é int,double,float
    int result = num * num;
    return result; //ou falar assim (return num * num;)

}
int cubo(int nu){
    return nu * nu * nu;
}

bool verificaIdade(int idade){

    if(idade >=18){
        return true;
    }
    else{
        return false;
    }

}

    int maior(int x,int y ){

        if(x >= y){
            return x;
        }
        else{
            return y;
        }
    }


int main(){
    int x = multiplicar(2);
    int y = multiplicar(3);
    int z = multiplicar(4);

    int idade = 21;

    if(verificaIdade(idade)){
        printf("você está apto para um cartão de crédito\n");
    }
    else{
        printf("você não possui mais de 18 anos");
    }

    int max = maior(2,3);

    printf("%d\n",max);
    return 0;
}