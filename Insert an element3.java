import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        int a[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int pos,val;
        pos=s.nextInt();
        val=s.nextInt();
        if(pos>n)
        {
            System.out.println("Invalid Input");
        }
        else{
            for(int i=n;i>=pos;i--)
            {
                a[i]=a[i-1];
            }
            a[pos-1]=val;
            for(int i=0;i<=n;i++)
            {
                System.out.println(a[i]);
            }
        }
    }
}


