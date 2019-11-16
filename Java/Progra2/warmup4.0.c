#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct estudiantes{
    int carne;
    int nota;
    char name[16]; 
    struct estudiantes * next;
}lista;


// typedef struct node {
//     int val;
//     struct node * next;
// } node_x;

// void push(node_t * head, int val) {
//     node_t * current = head;
//     while (current->next != NULL) {
//         current = current->next;
//     }

//     /* now we can add a new variable */
//     current->next = malloc(sizeof(node_t));
//     current->next->val = val;
//     current->next->next = NULL;
// };

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
    nextt->next = NULL;

    print_list(head);


}