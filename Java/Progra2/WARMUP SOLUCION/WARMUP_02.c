#include <stdio.h> 
#include <stdlib.h> 
#include <time.h>

struct Vector3
{
    int x,y,z;
};

int main(int argc, char const *argv[])
{
    printf("\n\t\tWARMUP_02\n\n");

    srand(time(0));
    int maxRangeX=11, maxRangeY=12, maxRangeZ=13;
    int minRangeX=1, minRangeY=2, minRangeZ=3;
    
    struct Vector3 points[20];

    int i;
    int randomX, randomY, randomZ;
    for(i=0;i<20;i++)
    {
        randomX = minRangeX + rand() / (RAND_MAX / (maxRangeX - minRangeX + 1) + 1);
        randomY = minRangeY + rand() / (RAND_MAX / (maxRangeY - minRangeY + 1) + 1);
        randomZ = minRangeZ + rand() / (RAND_MAX / (maxRangeZ - minRangeZ + 1) + 1);
        printf("Agregando el vector: <%i,%i,%i>\n", randomX, randomY, randomZ);
        points[i].x = randomX;
        points[i].y = randomY;
        points[i].z = randomZ;
    }

    printf("\n====================== LISTA DE VECTORES GUARDADOS: \n\n");

    for(i=0;i<20;i++)
    {
        printf("%02i) <%i,%i,%i>\n", i+1, points[i].x, points[i].y, points[i].z);
    }

    return 0;
}
