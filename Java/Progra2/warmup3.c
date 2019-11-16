#include <stdio.h>
#include <string.h>


struct estudiante{
    int carne;
    int nota;
    char name[16]; //there is a null by the end, so the size for names will be 16
};

void buscar(int nocarne, struct estudiante estudiantes[]){
    int i;
    for (i=0;i<15;i++){
        if (nocarne==estudiantes[i].carne)
            printf("Nombre: %s\nCarne: %i\nNota: %i\n",estudiantes[i].name,estudiantes[i].carne,estudiantes[i].nota);
        
        }
}

int main(int argc, char*argv[])
{
    struct estudiante estudiantes[15];
    int i,nocarne;
    strcpy(estudiantes[0].name,"Anesveth");
    strcpy(estudiantes[1].name,"Josh");
    strcpy(estudiantes[2].name,"Keaton");
    strcpy(estudiantes[3].name,"Chad");
    strcpy(estudiantes[4].name,"Harry");
    strcpy(estudiantes[5].name,"Louis");
    strcpy(estudiantes[6].name,"Liam");
    strcpy(estudiantes[7].name,"Zayn");
    strcpy(estudiantes[8].name,"Niall");
    strcpy(estudiantes[9].name,"Adriana");
    strcpy(estudiantes[10].name,"Collin");
    strcpy(estudiantes[11].name,"Michael");
    strcpy(estudiantes[12].name,"Calum");
    strcpy(estudiantes[13].name,"Luke");
    strcpy(estudiantes[14].name,"Ashton");
    int carnes[15]={1339,5689,9087,2389,2012,2010,2345,2345,1334,1773,8943,9472,1942,4892};
    int notas[15]={87,78,80,70,95,90,99,93,91,89,82,85,89,82,90};
    for (i=0;i<15;i++){
        estudiantes[i].carne=carnes[i];
        estudiantes[i].nota=notas[i];
    }

    
    printf("Ingrese el Numero de Carne del estudiante:");
    scanf("%i",&nocarne);

    buscar(nocarne,estudiantes);

    


}