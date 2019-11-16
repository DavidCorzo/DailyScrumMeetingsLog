#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char * assign(char *p, char *q){
    q = p;
    return q;
};

char * clone(char *p, char *q){
    while(p){
        *q=*p;
        p++;
        q++;
    }
    return q;
};

char * concat(char *p, char *q){
    char *r;
    r=malloc(sizeof(p)+sizeof(q));
    while(p){//recorre todo el p
        r=p;
        p++;//va avanzandon y copiando uno por uno al r
        r++;
    }
    while(q){
      r=q;
      q++;
      r++;

    }

    return r;//tiene los dos juntos
};

void dispose(char *p){
    free(p);
    p=NULL;
};

int main(int argc, char*argv[])
{
    char * string = "abc";
    char * q_destino;
    printf("String original: ");
    printf("%s",string);
    printf("\n");
    q_destino=assign(string , q_destino);
    printf("\n\nstring: %s\n", string);
    printf("DIR string: %p\n", string);
    printf("q: %s\n", q_destino);
    printf("DIR q: %p\n", q_destino);
}
