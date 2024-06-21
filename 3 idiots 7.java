Ajay, Binoy, and Chandru were very close friends at school. They were very good in Mathematics and they were the pet students of Emily Mam. Their gang was known as 3-idiots. Ajay, Binoy, and Chandru live in the same locality. A new student Dinesh joins their class and he wanted to be friends with them. He asked Binoy about his house address. Binoy wanted to test Dinesh's mathematical skills. Binoy told Dinesh that his house is at the midpoint of the line joining Ajay's house and Chandru's house. Dinesh was puzzled. Can you help Dinesh out? Given the coordinates of the 2 endpoints of a line (x1,y1) and (x2,y2), write a program to find the midpoint of the line.

Input Format

Input consists of 4 integers. The first integer corresponds to x1 . The second integer corresponds to y1. The third integer corresponds to x2. The fourth integer corresponds to y2.

Constraints

1>=x1>=10**9 1>=y>=10**9 1>=x2>=10**9 1>=y2>=10**9

Output Format

Refer Sample Input and Output for exact formatting specifications. [All floating point values are displayed correct to 1 decimal place]

Sample Input 0

2
4
10
15
Sample Output 0

Binoy's house is located at (6.0,9.5)
Sample Input 1

5
4
3
2
Sample Output 1

Binoy's house is located at (4.0,3.0)
Sample Input 2

6
8
7
9
Sample Output 2

Binoy's house is located at (6.5,8.5)
//source code
import java.io.*;

import java.util.*;

​

public class Solution {

​

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

         int x1=s.nextInt();

         int y1=s.nextInt();

         int x2=s.nextInt();

         int y2=s.nextInt();

        float x=(float) (x1 + x2) / 2;

        float y=(float) (y1 + y2) /2;

        System.out.printf("Binoy's house is located at (%.1f,%.1f)",x,y);

        

    }

}
