import java.util.*;
class MergeIntervel
{
public static void main(String args[])
{
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int a[]=new int[];
   for(int i=0;i<n;i++)
   {
       a[i]=s.nextInt();
      }
      for(int i=0;i<n-1;i++)
       {
         if(a[i]<a[i+1])
          {
            System.out.print(a[i]+" ");
         }
      }
      System.out.print(a[n-1]);
    }
 }
    
    
      
