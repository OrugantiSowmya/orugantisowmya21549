import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int max=a[0];
        for(int i=1;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
