import java.util.*;
class Maximum
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int max=0;
for(int i=0;i<n;i++)
{
for(int j=I;j<n;j++)
{
int sum=0;
for(int k=I;k<=j;k++)
{
sum=sum+a[k];
}
if(max<sum)
max=sum;
}
}
System.out.printl(max);
}
}


