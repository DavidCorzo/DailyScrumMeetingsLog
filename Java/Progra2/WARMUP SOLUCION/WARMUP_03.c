#include <stdio.h>

struct Student
{
    char* name;
    int id;
    int grade;
};

void fillStudents(struct Student stds[]);
void showStudents(struct Student stds[]);
void searchThisStudentId(struct Student stds[], int id);

int AMOUNT_OF_STUDENTS = 15;

int main(int argc, char const *argv[])
{
    printf("\n\t\tWARMUP_03\n\n");

    struct Student students[AMOUNT_OF_STUDENTS];
    int id;
    int option;

    fillStudents(students);
    
    while(option != 3)
    {
        printf("\n1) Listar Estudiantes\n2) Buscar estudiante por carne\n3) Salir\n\n>Ingrese una opcion: ");
        scanf("%i", &option);
        fflush(stdin);
        switch (option)
        {
            case 1:
                showStudents(students);
                break;
            case 2:
                printf("\n\tIngrese el carne del estudiante: ");
                scanf("%i", &id);
                fflush(stdin);
                searchThisStudentId(students, id);
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

void fillStudents(struct Student stds[])
{
    char* names[] = {"AaAa","BbBb","CcCc","DdDd","EeEe","FfFf","GgGg","HhHh","IiIi", "JjJj", "KkKk", "LlLl", "MmMm", "NnNn", "OoOo"};
    int ids[] = {190001,190002,190003,190004,190005,190006,190007,190008,190009,190010,190011,190012,190013,190014,190015};
    int grades[] = {100, 78, 90, 56, 34, 56, 78, 99, 23, 14, 19, 43, 98, 56, 66};
    int i;
    for(i=0; i<AMOUNT_OF_STUDENTS; i++)
    {
        stds[i].name = names[i];
        stds[i].id = ids[i];
        stds[i].grade = grades[i];
    }
}

void showStudents(struct Student stds[])
{
    int i;
    printf("\n\tNOMBRE\tCARNE\tNOTA\n");
    for(i=0; i<AMOUNT_OF_STUDENTS; i++)
    {
        printf("%02i)\t%s\t%i\t%i\n", i + 1, stds[i].name, stds[i].id, stds[i].grade);
    }
}

void searchThisStudentId(struct Student stds[], int id)
{
    int i;
    int found_index = -1;
    for (i = 0; i < AMOUNT_OF_STUDENTS; i++)
    {
        if (stds[i].id == id)
        {
            found_index = i;
            i = AMOUNT_OF_STUDENTS;
        }
    }
    if (found_index != -1)
    {
        printf("\n\tEl estudiante con carne: %i tiene la siguiente información:\n", id);
        printf("Nombre: %s\n", stds[found_index].name);
        printf("Carne : %i\n", stds[found_index].id);
        printf("Nota  : %i\n", stds[found_index].grade);
    }
    else
    {
        printf("\n\tNo se encontro al estudiante con carne: %i\n", id);
    }
}