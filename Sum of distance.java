import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        int sum=0;
       int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i<n && i+1<n){
                if(a[i+1]>a[i]){
                    sum=sum+a[i+1]-a[i];
                }
                else{
                    sum=sum+a[i]-a[i+1];
                }
            }
        }
        System.out.println(sum);
    }
}
