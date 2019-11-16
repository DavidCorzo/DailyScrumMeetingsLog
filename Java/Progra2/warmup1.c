#include <stdio.h>

struct punto3d{
    int x,y,z;
};

int main(int argc, char*argv[])
{
    struct punto3d mipunto;
    int x,y,z;
    printf("Bienvenidos al primer programa\n ingrese el primer valor:");
    scanf("%i",&mipunto.x);
    printf("ingrese el segundo valor:");
    scanf("%i",&mipunto.y);
    printf("ingrese el tercer valor:");
    scanf("%i",&mipunto.z);
    printf("punto en 3D: (%i,%i,%i)",mipunto.x,mipunto.y,mipunto.z);
}