import java.util.*;
class Sort
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
Arrays.Sort(a);
for(int i=0;i<n/2;i++)
{
  System.out.print(a[n-1-i]+" "+a[i]);
 }
 }
 }
