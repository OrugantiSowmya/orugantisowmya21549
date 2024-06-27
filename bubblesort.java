import java.util.*;
class Test
{
 static void main(String args[])
{
for(int i=n-1;i>0;i--)
{
  for(int j=0;j<i;j++)
   { 
     if(a[i]>a[j+i])
      {
        int t=a[j];
        a[j]=a[j+1];
        a[j+1]=+;
       }
      }
     }
   }
public static void main(String args[])
{ 
 Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
  a[i]=s.nextInt();
 }
bubbleSort(a,n);
for(int i=0;i<n;i++)
{
   System.out.print(a[i]+" ");
  }
 }
}
