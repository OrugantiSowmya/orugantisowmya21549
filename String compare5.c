#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    char ch1[20],ch2[20];
    scanf("%s",ch1);
    scanf("%s",ch2);
    if(strcmp(ch1,ch2)==0)
        printf("Strings are same");
    else
    {
        printf("Strings are not same");
    }

    return 0;
}
