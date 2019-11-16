#include <stdio.h>
#include <stdlib.h>

struct Student
{
    char* name;
    int id;
    int grade;
    struct Student* next;
};

void fillStudents(struct Student** head);
void showStudents(struct Student* student);
void searchThisStudentId(struct Student* std, int id);

int AMOUNT_OF_STUDENTS = 15;

int main(int argc, char const *argv[])
{
    printf("\n\t\tWARMUP_04\n\n");

    struct Student* std_list;
    int id;
    int option;

    fillStudents(&std_list);
    while (option != 3)
    {
        printf("\n1) Listar Estudiantes\n2) Buscar estudiante por carne\n3) Salir\n\n>Ingrese una opcion: ");
        scanf("%i", &option);
        fflush(stdin);
        switch (option)
        {
        case 1:
            showStudents(std_list);
            break;
        case 2:
            printf("\n\tIngrese el carne del estudiante: ");
            scanf("%i", &id);
            fflush(stdin);
            searchThisStudentId(std_list, id);
            break;
        case 3:
            printf("\n\tSaliendo del programa...\n");
            break;
        default:
            printf("\n\tOpción no válida\n");
            break;
        }
    }
    return 0;
}

void fillStudents(struct Student** head)
{
    char *names[] = {"AaAa", "BbBb", "CcCc", "DdDd", "EeEe", "FfFf", "GgGg", "HhHh", "IiIi", "JjJj", "KkKk", "LlLl", "MmMm", "NnNn", "OoOo"};
    int ids[] = {190001, 190002, 190003, 190004, 190005, 190006, 190007, 190008, 190009, 190010, 190011, 190012, 190013, 190014, 190015};
    int grades[] = {100, 78, 90, 56, 34, 56, 78, 99, 23, 14, 19, 43, 98, 56, 66};
    int i;
    for (i = 0; i < AMOUNT_OF_STUDENTS; i++)
    {
        struct Student* temp_aux = (struct Student *)malloc(sizeof(struct Student));
        temp_aux->name = names[i];
        temp_aux->id = ids[i];
        temp_aux->grade = grades[i];
        if(*head == NULL)
        {
            *head = temp_aux;
        }
        else
        {
            struct Student* head_aux = *head;
            while (head_aux->next != NULL)
            {
                head_aux = head_aux->next;
            }
            head_aux->next = temp_aux;
        }
    }
}

void showStudents(struct Student* student)
{
    int i = 0;
    printf("\n\tNOMBRE\tCARNE\tNOTA\n");
    while (student != NULL)
    {
        i++;
        printf("%02i)\t%s\t%i\t%i\n", i, student->name, student->id, student->grade);
        student = student->next;
    }
}

void searchThisStudentId(struct Student* std, int id)
{
    int found_index = 0;
    while (std != NULL && found_index == 0)
    {
        
        if (std->id == id)
        {
            printf("\n\tEl estudiante con carne: %i tiene la siguiente información:\n", id);
            printf("Nombre: %s\n", std->name);
            printf("Carne : %i\n", std->id);
            printf("Nota  : %i\n", std->grade);
            found_index = 1;
        }
        std = std->next;
    }
    if(found_index == 0)
    {
        printf("\n\tNo se encontro al estudiante con carne: %i\n", id);
    }
}