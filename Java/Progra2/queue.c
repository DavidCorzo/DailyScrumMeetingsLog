#include <stdio.h>

int queue[20];
int n = 20;
int  front =-1;
int back = -1;

void Insert()
{
    //Enqueue: insert element in the back of the queue
    int valor;
    if (back == n-1)
    {
        printf("\nQueue oferflow\n");
    }
    else
    {
        if (front == -1)
            front =0;
        printf("\n Inserte un elemento:\n");
        scanf("%d", &valor);
        back = back+1;
        queue[back]= valor;
    }
}

void Delete()
{
    //Dequeue: removing the front item
    int valoraeliminar;
  if (front == -1 && front > back)
  {
      printf("\nQueue underflow\n");
      return;
  }
  else
  {
     
      printf("\nEl elemento que desea eliminar es: %d\n", queue[front]);
      front = front+1;
      //Elementos van saliendo en orden de: First in First Out
  }
}
void Display()
{
   int lista;
   if (front == -1)
   {
       printf("\nQueue vacía\n");
   }
   else
   {
       printf("\nQueue:\n");
       for (lista = front; lista <= back; lista++)
       {
           printf("%d", queue[lista]);
           printf("\n");
       }
   }

}

int main() {
  while(1) {
      printf("\n Elija una de las siguientes opciones:\n");
      printf("\n1. Insertar un elemento\n");
      printf("\n2. Eliminar un elemento\n");
      printf("\n3. Mostrar queue\n");
      int choice;
      scanf("%d", &choice);
      switch (choice) {
          case 1:
              Insert();
              break;
          case 2:
              Delete();
              break;
          case 3:
              Display();
              break;
      }
  }



    return 0;
}