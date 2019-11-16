// RANDOM:  http://c-faq.com/lib/randrange.html
// SRAND & RAND: https://www.geeksforgeeks.org/rand-and-srand-in-ccpp/
// INTRESTING: 
#include <stdio.h> 
#include <stdlib.h> 
#include <time.h> 

int main(void) 
{ 
    // random time seed
    srand(time(0)); 
    // range for random numbers
    int maxRangeX=11, maxRangeY=12, maxRangeZ=13;
    int minRangeX=1, minRangeY=2, minRangeZ=3;
    char ch;
    // inifite loop
    while(1)
    {
        printf("Press ENTER to generate random 3D vector: ");
        ch=fgetc(stdin);
        if(ch==0x0A) // checking ENTER key
        {    
            // generating random numbers
            int randomX = minRangeX + rand() / (RAND_MAX / (maxRangeX - minRangeX + 1) + 1);
            int randomY = minRangeY + rand() / (RAND_MAX / (maxRangeY - minRangeY + 1) + 1);
            int randomZ = minRangeZ + rand() / (RAND_MAX / (maxRangeZ - minRangeZ + 1) + 1);
            printf("(%i,%i,%i)\n", randomX, randomY, randomZ);
        }
    }
    return 0; 
} 