#include <stdio.h>
#include <stdlib.h>
#include <time.h>

struct puntos3d
{
    int x,y,z;
};

int main(int argc, char*argv[])
{
    struct puntos3d punto[20];
    int n,i;
    int maxRange=20;
    int minRangeX=1, minRangeY=2, minRangeZ=3;
    srand(time(0)); 

    printf("\nPuntos almacenados:");
    for (n=0;n<20;n+=1){
        int randomX = minRangeX + rand() / (RAND_MAX / (maxRange - minRangeX + 1) + 1);
        int randomY = minRangeY + rand() / (RAND_MAX / (maxRange - minRangeY + 1) + 1);
        int randomZ = minRangeZ + rand() / (RAND_MAX / (maxRange - minRangeZ + 1) + 1);
        punto[n].x=randomX;
        punto[n].y=randomY;
        punto[n].z=randomZ;  
    }
    for (i=0;i<20;i++){
        printf("\n(%d,%d,%d)",punto[i].x,punto[i].y,punto[i].z);
    }

}