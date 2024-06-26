#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int n1,n2;
    scanf("%d%d",&n1,&n2);
    int a[n1],b[n2],i;
    for(i=0;i<n1;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n2;i++)
    {
        scanf("%d",&b[i]);
    }
    if(n1!=n2)
    {
        printf("Not Same");
    }
    else
    {
        for(i=0;i<n1;i++)
        {
            if(a[i]!=b[i])
            {
                printf("Not Same");
                break;
            }
        }
 }
    if(i==n1)
        printf("Same");
    return 0;
}
