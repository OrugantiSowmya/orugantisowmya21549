#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int n;
    scanf("%d",&n);
    int a[n+1],i;
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    int pos,val;
    scanf("%d%d",&pos,&val);
    if(pos>n){
        printf("Invalid Input");
}
    else
{
        for(i=n;i>=pos;i--)
        {
            a[i]=a[i-1];
        }
        a[pos-1]=val;
        for(i=0;i<=n;i++)
        {
            printf("%d\n",a[i]);
        }
}
    return 0;
}
