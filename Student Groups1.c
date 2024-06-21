Accept total number of participants in class. A group of four divisions has to be created from registered participants. Total no of participants “P” 100>=p<=200 Note: If number of participants entered by user is less than 100 or greater than 200 display “INVALID INPUT” and quit.

Input Format

Take number of students in a class

Constraints

100>=p<=200

Output Format

Print Stidents in group wise

Sample Input 0

104
Sample Output 0

26
26
26
26
Sample Input 1

127
Sample Output 1

31
31
31
34
Sample Input 2

320
Sample Output 2

INVALID INPUT
Sample Input 3

102
Sample Output 3

25
25
25
27
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
 int a;
    scanf("%d",&a);
    if(a>=100 && a<=200)
    {
        int r=a/4;
        printf("%d\n%d\n%d\n%d",r,r,r,r+a%4);
    }
    else
    {
        printf("INVALID INPUT");
    }
  
    return 0;
}

