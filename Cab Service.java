import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        int n1,n2;
         n1=s.nextInt();
         n2=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
          if(a[i]>n1&&a[i]<n2){
              System.out.print(a[i]+" ");
          }
    }
}
}
