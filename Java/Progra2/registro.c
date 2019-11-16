#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct equipo{
    int cantidad_de_jugadores;
    char capitan[20];
    char nombre[20];
    struct equipo * next;
}lista;


void print_list_of_teams(lista * head) {
    lista * now = head;
    while (now != NULL) {
        printf("\nNombre: %s\n", now->nombre);
        printf("Cantidad de Jugadores: %i\n", now->cantidad_de_jugadores);
        printf("Capitan: %s\n", now->capitan);
        now = now->next;
    }
};

// void buscar(char nombre, struct equipo team[15]){
//     int i;
//     for (i=0;i<15;i++){
//         if (nombre==list_of_teams[i].nombre)
//             printf("Nombre: %s\nCantidad de Jugadores: %i\nCapitan: %i\n",list_of_teams[i].nombre,list_of_teams[i].cantidad_de_jugadores,list_of_teams[i].capitan);
        
//         }
// }
int main(int argc, char*argv[])
{
    lista * nextt = NULL;
    lista * head = NULL;
    head = malloc(sizeof(lista));
    char c[20],n[20];
    int amount,quantity,i;
    for (i=0;i<2;i++){
        if (i>=1){
            nextt=nextt->next;
            printf("\n\n ingrese el nombre del equipo:");
            scanf("%s",n);
            strcpy(nextt->nombre,n);
            printf("\ningrese la cantidad de jugadores:");
            scanf("%i",&quantity);
            if (quantity<15)
                printf("\nDeben ser minimo 15 :(\ningrese la cantidad de jugadores:");
                while (quantity<15)
                    scanf("%i",&quantity);
            nextt->cantidad_de_jugadores=quantity;
            printf("\n ingrese el nombre del capitan:");
            scanf("%s",c);
            strcpy(nextt->capitan,c);
            nextt->next = malloc(sizeof(lista));
        }
        printf("LIGA DE EQUIPOS !\n\n ingrese el nombre del equipo:");
        scanf("%s",n);
        strcpy(head->nombre,n);//head (lissta) -> (.) 
        printf("\ningrese la cantidad de jugadores:");
        scanf("%i",&quantity);
        if (quantity<15)
            printf("\nDeben ser minimo 15 :(\ningrese la cantidad de jugadores:");
            while (quantity<15)
                
                scanf("%i",&quantity);
        head->cantidad_de_jugadores=quantity;
        printf("\n ingrese el nombre del capitan:");
        scanf("%s",c);
        strcpy(head->capitan,c);
        head->next = malloc(sizeof(lista));
        nextt=head->next;
        
    }
    print_list_of_teams(head);



}