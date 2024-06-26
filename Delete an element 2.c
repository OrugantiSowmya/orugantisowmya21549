#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main(){

    int n;
    scanf("%d",&n);
    int a[n],i;
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    int pos;
    scanf("%d",&pos);
        if(pos>n)
        {
            printf("Invalid Input");
        }
        else
        {
            for(i=pos-1;i<n;i++)
            {
                a[i]=a[i+1];
            }
        
        for(i=0;i<n-1;i++)
        {
            printf("%d\n",a[i]);
        }
    }
    return 0;
}
