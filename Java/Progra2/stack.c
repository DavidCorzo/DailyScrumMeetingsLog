#include <stdio.h>
#include <string.h>

int frontitem=-1;
int backitem=-1;
int listsize=5;
/*Hard code*/
int stack[]={3,4,7,0,1};

// /*Start struct*/
// struct node{
//     int data;
//     struct node.next;
// }



void printwholestack()
{
    int counter;
    for (counter=0;counter<5;counter++)
    {
        printf("==> %i\n",stack[counter]);
    }
}
void insert()
{
    int add;
    printf("\nIngrese el numero a agregar al stack: ");
    scanf("%i", &add);
    frontitem = frontitem + 1;   
    printf("%i",frontitem);
    stack[frontitem] = add;
    
}

void pop()
{
    int pup;
    pup = stack[frontitem];
    frontitem = frontitem - 1;   
    printf("\n==>%i\n",stack[pup]);
}

int main(int argc, char*argv[])
{   
    while(1){
        printf("-------------------------------");
        printf("\n Elija una de las siguientes opciones:\n");
        printf("\n1. Insertar un elemento\n");
        printf("\n2. pop\n");
        printf("\n3. Mostrar stack\n");
        int choice;
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                insert();
                printwholestack();
                break;
            case 2:
                pop();
                break;
            case 3:
                printwholestack();
                break;                    
                }   
            

    }
  return 0;
}

// 1. Tenemos que usar listas encadenadas?
// 2. Podría enseñarnos a usar listas encadenadas?