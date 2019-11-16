#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct estudiantes{
    int carne;
    int nota;
    char name[16]; 
    struct estudiantes * next;
}lista;


void print_list(lista * head) {
    lista * current = head;

    while (current != NULL) {
        printf("\nNombre:%s\n", current->name);
        printf("Carne:%i\n", current->carne);
        printf("Nota:%i\n", current->nota);
        current = current->next;
    }
};
//CAMBIAR DAATOS CARNE Y NOTAS

int main(int argc, char*argv[])
{
    lista * nextt = NULL;
    lista * head = NULL;
    head = malloc(sizeof(lista));
    strcpy(head->name,"Anesveth");//head (lissta) -> (.) 
    head->carne=2002;
    head->nota=87;
    head->next = malloc(sizeof(lista));
    nextt=head->next;

    strcpy(nextt->name,"Louis");
    nextt->carne=1997;
    nextt->nota=78;
    nextt->next = malloc(sizeof(lista));

    nextt=nextt->next;
    strcpy(nextt->name,"Harry");
    nextt->carne=2010;
    nextt->nota=89;
    nextt->next = malloc(sizeof(lista));

    nextt=nextt->next;
    strcpy(nextt->name,"Josh");
    nextt->carne=1234;
    nextt->nota=80;
    nextt->next = malloc(sizeof(lista));

    nextt=nextt->next;
    strcpy(nextt->name,"Keaton");
    nextt->carne=9678;
    nextt->nota=94;
    nextt->next = malloc(sizeof(lista));

    nextt=nextt->next;
    strcpy(nextt->name,"Chad");
    nextt->carne=3478;
    nextt->nota=78;
    nextt->next = malloc(sizeof(lista));

    nextt=nextt->next;
    strcpy(nextt->name,"Liam");
    nextt->carne=8945;
    nextt->nota=85;
    nextt->next = malloc(sizeof(lista));

    nextt=nextt->next;
    strcpy(nextt->name,"Zayn");
    nextt->carne=6784;
    nextt->nota=87;
    nextt->next = malloc(sizeof(lista));

    nextt=nextt->next;
    strcpy(nextt->name,"Niall");
    nextt->carne=5879;
    nextt->nota=92;
    nextt->next = malloc(sizeof(lista));

    nextt=nextt->next;
    strcpy(nextt->name,"Adriana");
    nextt->carne=4938;
    nextt->nota=84;
    nextt->next = malloc(sizeof(lista));

    nextt=nextt->next;
    strcpy(nextt->name,"Collin");
    nextt->carne=7893;
    nextt->nota=81;
    nextt->next = malloc(sizeof(lista));

    nextt=nextt->next;
    strcpy(nextt->name,"Michael");
    nextt->carne=9845;
    nextt->nota=94;
    nextt->next = malloc(sizeof(lista));

    nextt=nextt->next;
    strcpy(nextt->name,"Calum");
    nextt->carne=9856;
    nextt->nota=95;
    nextt->next = malloc(sizeof(lista));

    nextt=nextt->next;
    strcpy(nextt->name,"Luke");
    nextt->carne=1337;
    nextt->nota=99;
    nextt->next = malloc(sizeof(lista));

    nextt=nextt->next;
    strcpy(nextt->name,"Ashton");
    nextt->carne=4568;
    nextt->nota=100;
    nextt->next = NULL;

    print_list(head);


}