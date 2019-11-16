#include <stdio.h>

void assign1(char **q, char **p)
{
    *p = *q;
}

char * assign2(char * q, char * p)
{
    p = q;
    return p;
}

int main () 
{
    char * str1 = "This is a string";
    char * str2;
    printf("=========ANTES DE ASSIGN1=========\n");
    printf("DIR STR1: %p\n", str1);
    printf("DIR STR2: %p\n", str2);
    printf("==================================\n");
    assign1(&str1, &str2);
    printf("=========DESPUES DE ASSIGN1========\n");
    printf("STR1: %s\n", str1);
    printf("DIR STR1: %p\n", str1);
    printf("STR2: %s\n", str2);
    printf("DIR STR2: %p\n", str2);
    printf("==================================\n");
    char * str3 = "Another string";
    char * str4;
    printf("=========ANTES DE ASSIGN2=========\n");
    printf("DIR STR3: %p\n", str3);
    printf("DIR STR4: %p\n", str4);
    printf("==================================\n");
    str4 = assign2(str3, str4);
    printf("=========DESPUES DE ASSIGN2========\n");
    printf("STR3: %s\n", str3);
    printf("DIR STR3: %p\n", str3);
    printf("STR4: %s\n", str4);
    printf("DIR STR4: %p\n", str4);
    printf("==================================\n");
    

}