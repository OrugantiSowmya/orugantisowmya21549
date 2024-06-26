Given an unsorted array Arr[] and a number N. You need to write a program to find if there exists a pair of elements in the array whose difference is N.

Input Format

First line of input contains an integer T which denotes the number of test cases. Then T test cases follow. First line of each test case contains two space separated integers L and N where L denotes the length of array or the number of elements in the array and N denotes the difference between two elements. Second line of each test case contains L space separated integers which denotes the elements of the array.

Constraints

1<=T<=100 1<=L<=104 1<=Arr[i]<=105

Output Format

For each test case, in a new line print 1 if the pair is found otherwise print -1 if there does not exist any such pair.

Sample Input 0

2
6 78
5 20 3 2 5 80
5 45
90 70 20 80 50
Sample Output 0

1
-1
Sample Input 1

4
6 54 
5 20 3 2 5 80
5 100
90 70 20 80 170
4 88
10 20 30 40
5 50
10 20 15 5 25
Sample Output 1

-1
1
-1
-1
  //source code
  import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0)
        {
            int n=s.nextInt();
            int k=s.nextInt();
            int a[]=new int[n];
            int c=0;
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    int r=Math.abs(a[i]-a[j]);
                    if(k==r)
                    {
                        System.out.println(1);
                        c=1;
                        break;
                    }
                }
            }
            if(c==0)
                System.out.println(-1);
            t--;
        }
    }
}

