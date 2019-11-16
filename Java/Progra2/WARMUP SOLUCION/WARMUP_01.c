#include<stdio.h>

struct Vector3
{
    int x,y,z;
};


int main(int argc, char const *argv[])
{

    struct Vector3 point;

    printf("\n\t\tWARMUP_01\n");
    printf("\nIngrese [X]: ");
    scanf("%i", &point.x);
    fflush(stdin);
    printf("\nIngrese [Y]: ");
    scanf("%i", &point.y);
    fflush(stdin);
    printf("\nIngrese [Z]: ");
    scanf("%i", &point.z);
    fflush(stdin);
    printf("\n\t\tRESULTADO: <%i,%i,%i>\n\n", point.x, point.y, point.z);
    
    return 0;
}
