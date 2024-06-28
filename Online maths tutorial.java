import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new 
        Scanner(System.in);
          int n;
           n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }  
        int s=0;
        for(int i=0;i<n;i++)
        {
            s=s+a[i];
            System.out.printf("%d ",s);
        }
    }
}
