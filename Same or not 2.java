import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       int m=s.nextInt();
        int n=s.nextInt();
        int a[]=new int[m];
        int b[]=new int[n];
        int i;
        for(i=0;i<m;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            b[i]=s.nextInt();
        }
        if(m!=n)
        {
            System.out.println("Not Same");
        }
    if(m==n)
    {
        for(i=0;i<n;i++){
            if(a[i]!=b[i]){
                System.out.println("Not Same");
                break;
            }
        }
        if(i==n){
            System.out.println("Same");
        }
    }
    }

    }
