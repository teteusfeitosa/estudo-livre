#include <stdio.h>
/*
Um casal divide as despesas domésticas mensalmente. Durante o
mês cada um anota seus gastos e as contas que paga; no final eles dividem meio a meio.
O casal deseja um programa que facilite o acerto: eles digitariam os gastos de cada um, e
o programa mostraria quem deve a quem.
Portanto, os saldos devem ser iguais, e quem tiver o saldo negativo deve pagar o valor
para o outro. Faça um programa que leia os valores adequados e efetue os cálculos.
*/
int main(){
    double total;
    double pagoH; 
    double pagoM;
    double pagamento;
    
    printf("A mulher possui quantos R$\n");
    scanf("%lf",&pagoM);
    
    printf("O homem possui quantos R$\n");
    scanf("%lf",&pagoH);
    
    total = pagoH + pagoM;
    pagamento = total/2;
    double saldoH = pagoH - pagamento;
    double saldoM = pagoM - pagamento;

    printf("Em tese cada um pagaria %.2lfR$\n",pagamento);
    
    if(saldoH < 0){
        saldoH = -(saldoH);
        printf("A mulher deve pagar %.2lfR$\n",saldoH);
    }
    else if(saldoM < 0){
        saldoM = -(saldoM);
        printf("O homem deve pagar %.2lfR$\n",saldoM);                
    }
    else{
        printf("Ninguém deve nada\n");
    }

    
    return 0;
}

    
    




