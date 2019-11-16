#include <stdio.h>
#include <stdlib.h>

void assign(char** q, char** p);
void clone(char* q, char* p);
int lenght(char* q);
char* concat(char* q, char* p);
void dispose(char** q);

int main()
{
    printf("================ASSIGN============\n");
    char* str1 = "This is a string";
    char* str2;
    printf("==<ORIGINAL DIRS>\n");
    printf("STR1: %p\n", str1);
    printf("STR2: %p\n", str2);
    assign(&str1, &str2);
    printf("==<AFTER ASSIGN DIRS>\n");
    printf("STR1: %p\n", str1);
    printf("STR2: %p\n", str2);
    printf("==<RESULT>\n");
    printf("STR1: %s\n", str1);
    printf("STR2: %s\n", str2);
    printf("================CLONE============\n");
    char* str3 = "This is another string";
    char* str4;
    printf("==<ORIGINAL DIRS>\n");
    printf("STR3: %p\n", str3);
    printf("STR4: %p\n", str4);
    clone(str3, str4);
    printf("==<DIRS AFTER CLONE>\n");
    printf("STR3: %p\n", str3);
    printf("STR4: %p\n", str4);
    printf("==<RESULT>\n");
    printf("STR3: %s\n", str3);
    printf("STR4: %s\n", str4);
    printf("================CONCAT============\n");
    char* str5 = "yet another";
    char* str6 = " greate string";
    printf("==<ORIGINAL STRINGS>\n");
    printf("STR5: %s\n", str5);
    printf("STR6: %s\n", str6);
    char* str7 = concat(str5, str6);
    printf("==<RESULT>\n");
    printf("STR7: %s\n", str7);
    printf("================DISPOSE===========\n");
    char *str8 = "some string";
    printf("==<ORIGINAL STRINGS>\n");
    printf("STR8: %s\n", str8);
    dispose(&str8);
    printf("==<RESULT>\n");
    printf("STR8: %s\n", str8);
}

void assign(char** q, char** p)
{
    *p = *q;
}

void clone(char* q, char* p)
{
    while(*q)
    {
        *p = *q;
        q++;
        p++;
    }
}

int lenght(char* q)
{
    int i = 0;
    while (*q)
    {
        i++;
        q++;
    }
    return i;
}

char* concat(char* q, char* p)
{
    char *k = (char *)malloc(lenght(q) + lenght(p) + 1);

    int i = 0;
    while (*q)
    {
        k[i] = *q;
        i++;
        q++;
    }
    while(*p){
        k[i] = *p;
        i++;
        p++;
    }
    k[i] = '\0';
    return k;   
}

void dispose(char **q)
{
    *q = NULL;
}