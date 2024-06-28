import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
        int n,i;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int es=0,os=0;
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                es=es+a[i];                  
            }
            else
            {
                os=os+a[i];
            }
        }
        System.out.println(os);
         System.out.println(es);
    }
}
