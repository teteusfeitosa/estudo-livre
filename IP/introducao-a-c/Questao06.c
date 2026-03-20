#include <stdio.h>
#include <string.h>
/*
* Usando strings em c
*/
int main(){
    char substantivo [50] = "";
    char verbo [50] = "";
    char adjetivo1 [50] = "";
    char adjetivo2 [50] = "";
    char adjetivo3 [50] = "";

    printf("coloque um adjetivo (descrição): ");
    fgets(adjetivo1, sizeof(adjetivo1), stdin);
    adjetivo1[strlen(adjetivo1) - 1]= '\0';

    printf("coloque um substantivo (pessoa ou animal): ");
    fgets(substantivo, sizeof(substantivo), stdin);
    substantivo[strlen(substantivo) - 1]= '\0';

    printf("coloque um adjetivo (descrição): ");
    fgets(adjetivo2, sizeof(adjetivo2), stdin);
    adjetivo2[strlen(adjetivo2) - 1]= '\0';

    printf("coloque um verbo: ");
    fgets(verbo, sizeof(verbo), stdin);
    verbo[strlen(verbo) - 1]= '\0';

    printf("coloque um adjetivo (descrição): ");
    fgets(adjetivo3, sizeof(adjetivo3), stdin);
    adjetivo3[strlen(adjetivo3) - 1]= '\0';

    printf("%s\n",substantivo);
    printf("%s\n",verbo);
    printf("%s\n",adjetivo3);
    printf("%s\n",adjetivo2);
    printf("%s\n",adjetivo1);

    
    return 0;
}